package lp_tp1;
import java.io.*;  
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import lp.*; 

class ComandoWriteVar extends Comando {
   
   String nome;
   Variaveis var=new Variaveis();
   ComandoWriteVar(int lin, String txt) {
      linha= lin;
      nome=txt;
   }
   
   
   
   
   public int executa() {
       var.lerArquivo();
       System.out.printf("%f",var.getVar(nome));
     
     
      return linha+1;
   }
}