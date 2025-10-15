package arrays_exercises;

import utils.Utility;
import javax.swing.*;
//Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posición está el número
//cuya suma de dígitos sea la mayor.
public class Exercise7 {
    public static void execute() {
        int[] numbers = Utility.readIntegerArray("Ingrese número ", 10);

        int maxSuma = -1;
        int posicion = -1;

        for (int i = 0; i < numbers.length; i++) {
            int sumaDigitos = sumaDeDigitos(Math.abs(numbers[i]));
            if (sumaDigitos > maxSuma) {
                maxSuma = sumaDigitos;
                posicion = i;
            }
        }

        String mensaje = "La mayor suma de dígitos es: " + maxSuma +
                "\nSe encuentra en la posición: " + posicion +
                "\nNúmero: " + numbers[posicion];

        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static int sumaDeDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}
