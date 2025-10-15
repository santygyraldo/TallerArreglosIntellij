package arrays_exercises;

import utils.Utility;

import javax.swing.*;
// Leer 10 números enteros, almacenarlos en un arreglo y determinar si el promedio entero de estos
//datos está almacenado en el arreglo.
public class Exercise6 {
    public static void execute() {
        int[] numbers = Utility.readIntegerArray("Ingrese número ", 10);

        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        int promedio = suma / numbers.length;
        boolean encontrado = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == promedio) {
                encontrado = true;
                break;
            }
        }

        String mensaje = "El promedio entero es: " + promedio + "\n";
        mensaje += encontrado
                ? "El promedio SÍ está en el arreglo."
                : "El promedio NO está en el arreglo.";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
