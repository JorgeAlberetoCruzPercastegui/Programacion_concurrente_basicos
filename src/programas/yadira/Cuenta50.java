
package programas.yadira;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author PERCASTEGUI
 */
public class Cuenta50 implements Runnable{
    int numero;
Cuenta50() {}
Cuenta50(int num) {
numero = num;
}
public void run() {
for(int i = 0; i < 50; ++i) {
System.out.println(numero + " + " + i + " = " + (numero + i) );
}
}

    public static void main(String[] args) {
        int[] nums = new int[] {45, 320, 887, 11, 2398, 402, 674, 3057, 1823, 5956};
int numTareas = nums.length;
ExecutorService exec = Executors.newCachedThreadPool();
Cuenta50[] tareas = new Cuenta50[numTareas];
for(int i = 0; i < numTareas; ++i) {
tareas[i] = new Cuenta50(nums[i]);
System.out.println("Tarea " + i + " creada.");
exec.execute(tareas[i]);
}
exec.shutdown();
    }


}
