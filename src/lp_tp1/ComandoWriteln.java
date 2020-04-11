package lp_tp1;
import java.io.*;  
import java.util.*;

import lp.*; 

class ComandoWriteln extends Comando {
   	
   ComandoWriteln(int lin) {
      linha= lin;
   }
   
   public int executa() {
      System.out.println("\n");
      return linha+1;
   }
}