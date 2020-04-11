package lp_tp1;
import java.io.*;  
import java.util.*;
import bsh.Interpreter;
import lp.*; 

class Interpretador {
   private ArquivoFonte arq;
   private Vector comandos;   
   private String palavraAtual;
   private Variaveis var;
   private Transformador tr;
   public Interpretador(String nome) {
      arq= new ArquivoFonte(nome);
      comandos= new Vector();
   }
   
   public void listaArquivo() {
      String palavra;
      
      do {
         palavra= arq.proximaPalavra();
         System.out.println ("Palavra: " + palavra);
      } while (!palavra.equals("EOF"));
   }
   
   public void leArquivo() {
      
      String comandoAtual;
      int linha= 0;
      do {
         comandoAtual= arq.proximaPalavra();
            
         if(comandoAtual.equals("endp")){
            trataComandoEndp(linha);
            linha++;
         }
         else if(comandoAtual.equals("writeln")){
            trataComandoWriteln(linha);
            linha++;
         }
         else if(comandoAtual.equals("writeStr")){
             arq.proximaPalavra();
             trataComandoWriteStr(linha,arq.proximaPalavra());             
             linha++;
         }
         else if(comandoAtual.equals("read")){
             arq.proximaPalavra();             
             trataComandoRead(linha,arq.proximaPalavra());
             linha++;
         }
         else if(comandoAtual.equals("writeVar")){
              arq.proximaPalavra();
              trataComandoWriteVar(linha,arq.proximaPalavra());
              linha++;
         }
         else  if(":=".equals(arq.proximaPalavra())){
            String s=""+comandoAtual;
            while(!";".equals(arq.proximaPalavra()))
            {   
                s=s+comandoAtual;
                comandoAtual=arq.proximaPalavra();
                linha++;
            }
            System.out.println(s);
            linha++;
         }                    		  
      } while (!comandoAtual.equals("endp"));
   }
   
   private void trataComandoEndp(int lin) {
      
      ComandoEndp c= new ComandoEndp(lin);
      comandos.addElement(c);
   }
   	   	
   private void trataComandoWriteln(int lin) {
      
      ComandoWriteln c= new ComandoWriteln(lin);
      comandos.addElement(c);
   }
   private void trataComandoWriteStr(int lin,String comandoAtual){
       ComandoWriteStr c= new ComandoWriteStr(lin,comandoAtual);
       comandos.addElement(c);  
   }
   private void trataComandoRead(int lin,String nome){
       ComandoRead c= new ComandoRead(lin,nome);
       comandos.addElement(c);
   }
   private void trataComandoWriteVar(int lin,String nome){
       ComandoWriteVar c=new ComandoWriteVar(lin,nome);
       comandos.addElement(c);
   }
   private void trataComandoExp(String exp){
       int j=0;int w=0;
       String e=exp;System.out.println(exp);
       while(e.charAt(j)!=';'){
           if(e.charAt(j)=='=')
               w=j+1;
           for(char i='a';i!='z'+1;i++){
           if(e.charAt(j)==i){
             e = e.replaceAll(String.valueOf(e.charAt(j)), Float.toString(var.getVar(String.valueOf(e.charAt(j)))));
           }
       }
           j++;
       }
       e.substring(w);
       Interpreter i=new Interpreter();
       try{
       e=""+i.eval(e);
       var.adicionar(exp.charAt(0),Float.valueOf(e));
   }   catch(Exception expt){
    }
   }
   
   public void executa() {
      
      Comando cmd;
      int pc= 0;
      do {
         cmd= (Comando) comandos.elementAt(pc);
         pc= cmd.executa();
      } while (pc != -1);
   }   
}
