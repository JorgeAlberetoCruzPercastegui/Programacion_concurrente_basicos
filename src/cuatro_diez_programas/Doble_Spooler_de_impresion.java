/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro_diez_programas;


public class Doble_Spooler_de_impresion extends Thread implements Runnable{
    
    String impresion;
    int inc=0;
    public Doble_Spooler_de_impresion(String nom){
    this.impresion= nom;
    }
    
    public void run(){
    for (int i=0; i<5; i++){
    inc++;
        System.out.println("Imprime "+impresion+"-> "+inc+" Proceso");
        yield();
    }
        System.out.println("Finaliza impresion "+impresion+"-> "+inc+" Procesos");
        yield();
    }
    
    public static void main(String[] args) {
        Doble_Spooler_de_impresion impresionuno= new Doble_Spooler_de_impresion("hoja 1");
        Thread t = new Thread(impresionuno);
        t.start();
        Doble_Spooler_de_impresion impresiondos= new Doble_Spooler_de_impresion("hoja 2");
        Thread tt = new Thread(impresiondos);
        tt.start();
        Doble_Spooler_de_impresion impresiontres= new Doble_Spooler_de_impresion("hoja 3");
        Thread ttt = new Thread(impresiontres);
        ttt.start();
        
    }
    
}
