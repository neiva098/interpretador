package lp_tp1;
import java.io.*;  
import java.util.*;

import lp.*; 

class ComandoRead extends Comando {
   
   BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
   char variavel;
   Variaveis var=new Variaveis();	
   ComandoRead(int lin, String txt) {
      linha= lin;
      variavel= txt.charAt(0);
   }
   
   public int executa() {
       	
      try {
         float valor;
         valor=Float.parseFloat(teclado.readLine());
         var.adicionar(variavel, valor);
         
      }
      catch( Exception e) {
         System.out.println("ERRO: "+e);
      }
      return linha+1;
   }
}