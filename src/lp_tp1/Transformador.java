
package lp_tp1;

import java.util.HashMap;

public class Transformador {
    private HashMap<Character,Integer> var;
    
    public Transformador(){
    
        var=new HashMap<>();
        var.put('a', 1);
        var.put('b', 2);
        var.put('c', 3);
        var.put('d', 4);
        var.put('e', 5);
        var.put('f', 6);
        var.put('g', 7);
        var.put('h', 8);
        var.put('i', 9);
        var.put('j', 10);
        var.put('k', 11);
        var.put('l', 12);
        var.put('m', 13);
        var.put('n', 14);
        var.put('o', 15);
        var.put('p', 16);
        var.put('q', 17);
        var.put('r', 18);
        var.put('s', 19);
        var.put('t', 20);
        var.put('u', 21);
        var.put('v', 22);
        var.put('w', 23);
        var.put('x', 24);
        var.put('y', 25);
        var.put('z', 26);
         
    
    }
    public boolean verifica(char c){
    
        return var.containsKey(c);
    
    
    }
    
    
}
