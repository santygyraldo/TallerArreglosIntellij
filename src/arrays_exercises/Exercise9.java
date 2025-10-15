package arrays_exercises;

import utils.Utility;

import javax.swing.*;
//Leer 10 números enteros, almacenarlos en un arreglo y mostrar en pantalla todos los enteros
//comprendidos entre 1 y cada uno de los números almacenados en el arreglo
public class Exercise9 {
    public static void execute() {
        int[] numbers = Utility.readIntegerArray("Ingrese número ", 10);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            result.append("Entre 1 y ").append(num).append(": ");

            if (num >= 1) {
                for (int j = 1; j <= num; j++) {
                    result.append(j).append(" ");
                }
            } else {
                result.append("El numero debe ser mayor a 1");
            }

            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
