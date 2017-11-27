/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas.yadira;

/**
 *
 * @author PERCASTEGUI
 */
public class PalabraRun implements Runnable{
    String palabra;
    
    PalabraRun(){}
    PalabraRun(String pal){
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
        Runnable pal1 = new PalabraRun("casa");
Runnable pal2 = new PalabraRun("ala");
Runnable pal3 = new PalabraRun("Oso");
new Thread(pal1).start();
new Thread(pal2).start();
new Thread(pal3).start();
System.out.println("Hilos terminados.");
    }
    
}
