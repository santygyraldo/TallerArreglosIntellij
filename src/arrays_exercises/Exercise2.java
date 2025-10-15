package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise2 {
    //leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está el mayor
    //número primo leído.
    public static void execute() {
        int[] numeros = Utility.readIntegerArray("Ingrese número ", 10);

        int mayorPrimo = -1, posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (Utility.isPrime(numeros[i]) && numeros[i] > mayorPrimo) {
                mayorPrimo = numeros[i];
                posicion = i;
            }
        }

        String mensaje = (mayorPrimo != -1)
                ? "El mayor número primo es: " + mayorPrimo + "\nPosición: " + posicion
                : "No se ingresaron números primos.";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
