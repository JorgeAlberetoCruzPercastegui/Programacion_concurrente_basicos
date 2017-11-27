/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas.yadira;

import java.util.Scanner;

/**
 *
 * @author PERCASTEGUI
 */
public class interfaz_runnable implements Runnable{

    Scanner s = new Scanner(System.in);
    int a,b;
    int multiplo=0;
    int x=0;
    int y=0;
    @Override
    public void run() {
        System.out.println("Ingresa numero");
        a= s.nextInt();
        for (int i=0; i<10; i++){
            a+=2;
        System.out.println(a);
        }
            
    }
   
    
}
