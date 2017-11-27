
package programas.yadira;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mult10 implements Runnable{
    int numero;
Mult10() {}
Mult10(int num) {
numero = num;
}
public void run() {
for(int i = 0; i < 10; ++i) {
System.out.println(numero + " * " + i + " = " + (numero * i) );
}
}

    public static void main(String[] args) {
        int[] nums = new int[] {45, 320, 887, 11, 2398, 402, 674, 3057, 1823, 5956};
int numTareas = nums.length;
ExecutorService exec = Executors.newSingleThreadExecutor();
Mult10[] tareas = new Mult10[numTareas];
for(int i = 0; i < numTareas; ++i) {
tareas[i] = new Mult10(nums[i]);
System.out.println("Tarea " + i + " creada.");
exec.execute(tareas[i]);
}
exec.shutdown();
        
        
    }


    
}
