/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas.yadira;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author PERCASTEGUI
 */
public class Task implements Runnable{
 
    private int id;
    public Task(){}
    public Task(int id){
    this.id= id;
    }
    @Override
    public void run() {
        System.out.println("Ejecutando tarea "+id);
        for (int i=0; i<5; i++){}
        System.out.println("Tarea finalizada "+id);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduz cantidad de tareas");
        int a = s.nextInt();
        System.out.println("Introduzca el numero de hilos");
        int cantidad= s.nextInt();
        
        ThreadPoolExecutor t = new ThreadPoolExecutor(cantidad,cantidad, 5000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
        Task[] taks= new Task[a];
        for (int i = 0; i < a; i++) {
            
            taks[i]= new Task(1);
            System.out.println("Tarea "+i+" a ejecutar");
            t.execute(taks[i]);
        }
        t.shutdown();
    }
}
