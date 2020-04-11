package lp_tp1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Variaveis{
   public static float[] var = new float[26];
   
   public void lerArquivo(){
       try(FileReader fl = new FileReader("Variaveis.txt")){
           BufferedReader in = new BufferedReader(fl);
           String linha = in.readLine();
           String nome;
           String variavel;
           float valor;
           int p1;
           while(linha!=null){
               
               p1=linha.indexOf(" ");
               
               nome=linha.substring(0,p1);
               variavel=linha.substring(p1+1);
               
               valor=Float.parseFloat(variavel);
                if("a".equals(nome))var[0]=valor;
                if("b".equals(nome))var[1]=valor;
                if("c".equals(nome))var[2]=valor;
                if("d".equals(nome))var[3]=valor;
                if("e".equals(nome))var[4]=valor;
                if("f".equals(nome))var[5]=valor;
                if("g".equals(nome))var[6]=valor;
                if("h".equals(nome))var[7]=valor;
                if("i".equals(nome))var[8]=valor;
                if("j".equals(nome))var[9]=valor;
                if("k".equals(nome))var[10]=valor;
                if("l".equals(nome))var[11]=valor;
                if("m".equals(nome))var[12]=valor;
                if("n".equals(nome))var[13]=valor;
                if("o".equals(nome))var[14]=valor;
                if("p".equals(nome))var[15]=valor;
                if("q".equals(nome))var[16]=valor;
                if("r".equals(nome))var[17]=valor;
                if("s".equals(nome))var[18]=valor;
                if("t".equals(nome))var[19]=valor;
                if("u".equals(nome))var[20]=valor;
                if("v".equals(nome))var[21]=valor;
                if("w".equals(nome))var[22]=valor;
                if("x".equals(nome))var[23]=valor;
                if("y".equals(nome))var[24]=valor;
                if("z".equals(nome))var[25]=valor;
                
               linha=in.readLine();
        }
               
       } catch (IOException ex) {
           System.err.println("Erro ao ler o Arquivo");
       }
   }
   
   public void adicionar(char nome,float valor){
   
       if('a'==nome)var[0]=valor;
       if('b'==nome)var[1]=valor;
       if('c'==nome)var[2]=valor;
       if('d'==nome)var[3]=valor;
       if('e'==nome)var[4]=valor;
       if('f'==nome)var[5]=valor;
       if('g'==nome)var[6]=valor;
       if('h'==nome)var[7]=valor;
       if('i'==nome)var[8]=valor;
       if('j'==nome)var[9]=valor;
       if('k'==nome)var[10]=valor;
       if('l'==nome)var[11]=valor;
       if('m'==nome)var[12]=valor;
       if('n'==nome)var[13]=valor;
       if('o'==nome)var[14]=valor;
       if('p'==nome)var[15]=valor;
       if('q'==nome)var[16]=valor;
       if('r'==nome)var[17]=valor;
       if('s'==nome)var[18]=valor;
       if('t'==nome)var[19]=valor;
       if('u'==nome)var[20]=valor;
       if('v'==nome)var[21]=valor;
       if('w'==nome)var[22]=valor;
       if('x'==nome)var[23]=valor;
       if('y'==nome)var[24]=valor;
       if('z'==nome)var[25]=valor;
       salvar();
       
   }
   public float getVar(String nome){
       if("a".equals(nome))return var[0];
       if("b".equals(nome))return var[1];
       if("c".equals(nome))return var[2];
       if("d".equals(nome))return var[3];
       if("e".equals(nome))return var[4];
       if("f".equals(nome))return var[5];
       if("g".equals(nome))return var[6];
       if("h".equals(nome))return var[7];
       if("i".equals(nome))return var[8];
       if("j".equals(nome))return var[9];
       if("k".equals(nome))return var[10];
       if("l".equals(nome))return var[11];
       if("m".equals(nome))return var[12];
       if("n".equals(nome))return var[13];
       if("o".equals(nome))return var[14];
       if("p".equals(nome))return var[15];
       if("q".equals(nome))return var[16];
       if("r".equals(nome))return var[17];
       if("s".equals(nome))return var[18];
       if("t".equals(nome))return var[19];
       if("u".equals(nome))return var[20];
       if("v".equals(nome))return var[21];
       if("w".equals(nome))return var[22];
       if("x".equals(nome))return var[23];
       if("y".equals(nome))return var[24];
       if("z".equals(nome))return var[25];
       return 0;
   
   }

    private void salvar() {
        try(FileWriter fl = new FileWriter("Variaveis.txt")){
            String str="";
            int i=0;
            
            str=        "a "+var[0]+"\n"+"b "+var[1]+"\n"+"c "+var[2]+"\n"+
                        "d "+var[3]+"\n"+"e "+var[4]+"\n"+
                        "f "+var[5]+"\n"+"g "+var[6]+"\n"+
                        "h "+var[7]+"\n"+"i "+var[8]+"\n"+
                        "j "+var[9]+"\n"+"k "+var[10]+"\n"+
                        "l "+var[11]+"\n"+"m "+var[12]+"\n"+
                        "n "+var[13]+"\n"+"o "+var[14]+"\n"+
                        "p "+var[15]+"\n"+"q "+var[16]+"\n"+
                        "r "+var[17]+"\n"+"s "+var[18]+"\n"+
                        "t "+var[19]+"\n"+"u "+var[20]+"\n"+
                        "v "+var[21]+"\n"+"w "+var[22]+"\n"+
                        "x "+var[23]+"\n"+"y "+var[24]+"\n"+
                        "z "+var[25]+"\n";
            fl.write(str);
        }
    
          catch (IOException ex) { 
              System.err.println("Erro ao salvar o arquivo");
         }
    }
 } 
