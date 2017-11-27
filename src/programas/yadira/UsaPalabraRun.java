/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas.yadira;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author PERCASTEGUI
 */
public class UsaPalabraRun implements Runnable {
    
    String palabra;
    
    UsaPalabraRun(){}
    UsaPalabraRun(String pal){
    palabra = pal;
    }
    
    public void run(){
    boolean polindromo= true;
    int i=0;
    int j= palabra.length()-1;
    
    while (polindromo && i<j){
    if (palabra.charAt(i) == palabra.charAt(j)){
    ++i;
    --j;
    }else{
        polindromo = false;
    }
    }
    if (polindromo){
        System.out.println("La palabra "+palabra+" es un palindromo");
    }else{
        System.out.println("La palabra "+palabra+" No es un palindromo");
    }
    }
    public static void main(String[] args) {
        
        String[] palabras = new String[]{"oso","casa","ala","ama","perro"};
        int numero = palabras.length;
        
        UsaPalabraRun up[] = new UsaPalabraRun[numero];
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i = 0; i < numero; ++i) {
up[i] = new UsaPalabraRun(palabras[i]);
System.out.println("Palabra " + palabras[i] + " creada.");
exec.execute(up[i]);
}
exec.shutdown();
        
    }
    
    
}
