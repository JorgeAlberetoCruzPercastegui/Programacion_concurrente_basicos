/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas.yadira;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author PERCASTEGUI
 */
public class OperacionesBasicasModificada implements Runnable {
    int x,y;
    
     OperacionesBasicasModificada(){}
    OperacionesBasicasModificada(int num0, int num2){
    x= num0;
    y= num2;
    }
    public void run(){
        System.out.println(x + " + " + y + " = " + (x + y) );
        System.out.println(x + " - " + y + " = " + (x - y) );
        System.out.println(x + " * " + y + " = " + (x * y) );
        System.out.println(x + " / " + y + " = " + (x / y) );
    }
    
    
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
int x = 3, y = 8;
System.out.println("Indique cu´antas tareas quiere ejecutar: ");
int numTareas = teclado.nextInt();
System.out.println("Indique cu´antos hilos quiere crear: ");
int numHilos = teclado.nextInt();


       
ExecutorService exec = Executors.newFixedThreadPool(numHilos);
OperacionesBasicasModificada[] tareas = new OperacionesBasicasModificada[numTareas];
for(int i = 0; i < numTareas; ++i) {
x = 3;
y = 8;
tareas[i] = new OperacionesBasicasModificada(x * (i+1), y * (i+1));
System.out.println("Tarea " + i + " creada.");
exec.execute(tareas[i]);
}
exec.shutdown();
}   
    
    
    
    
}
