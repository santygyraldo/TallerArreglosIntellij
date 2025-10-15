package arrays_exercises;

import utils.Utility;

import javax.swing.*;
//. Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones se encuentran
//los números terminados en 4
public class Exercise4 {
    public static void execute() {
        int[] numbers = Utility.readIntegerArray("Ingrese un número entero para la posición ", 10);
        StringBuilder result = new StringBuilder("Posiciones de números que terminan en 4:\n");

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) % 10 == 4) {  // Usamos Math.abs por si el número es negativo
                result.append("Posición ").append(i).append(" (Valor: ").append(numbers[i]).append(")\n");
                found = true;
            }
        }

        if (!found) {
            result = new StringBuilder("No hay números que terminen en 4.");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
