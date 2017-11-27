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
public class ProgramasYadira extends Thread{
    Scanner s = new Scanner(System.in);
    int a,b,c,d,e,f;
    public void run(){
        System.out.println("operaciones");
        System.out.println("Declara el primer numero");
        a = s.nextInt();
        System.out.println("Declara la segunda variable");
        b= s.nextInt();
        c=a+b;
        d= a-b;
        e= a*b;
        f= a/b;
        System.out.println("El suma es: "+c);
        System.out.println("El resta es: "+d);
        System.out.println("El multiplicacion es: "+e);
        System.out.println("El division es: "+f);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opc;
        System.out.println("******************");
        System.out.println("1.-Operaciones basicas");
        System.out.println("2.-Multiplo");
        System.out.println("3.-task");
        System.out.println("4.-Task0");
        System.out.println("5.-PalabraRun");
        System.out.println("6.-UsaPalabraRun");
        System.out.println("7.-OperacionesBasicasModificada");
        System.out.println("8.-Cuenta50");
        System.out.println("9.-");
        System.out.println("******************");
        System.out.println("Elige una opcion");
        opc= s.nextInt();
        switch (opc){
        case 1:
        ProgramasYadira py = new ProgramasYadira();
        py.start();
        break;
        case 2:
            interfaz_runnable ir= new interfaz_runnable();
        ir.run();
            break;
          
        }
        
        
        
    }
    
}
