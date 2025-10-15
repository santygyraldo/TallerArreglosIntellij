package arrays_exercises;

import utils.Utility;

import javax.swing.*;
//Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas veces está repetido el
//mayor.
public class Exercise5 {
    public static void execute() {
        int[] numbers = Utility.readIntegerArray("Ingrese un número entero para la posición ", 10);
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                count++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "El número mayor es: " + max + "\n" +
                        "Aparece " + count + " veces en el arreglo.");
    }
}
