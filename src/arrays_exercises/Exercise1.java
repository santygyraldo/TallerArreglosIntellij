package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise1 {
    public static void execute() {

        // Leer 10 números enteros y determinar el mayor numero leido
        int size = 10;
        int[] numeros = Utility.readIntegerArray("Ingrese número ", size);
        int mayor = numeros[0];
        int posicion = 0;
        for (int i = 1; i < size; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicion = i;
            }
        }
        // mostrar resultado
        JOptionPane.showMessageDialog(
                null,
                "Número mayor: " + mayor +
                        "\nPosición: " + posicion
        );
    }
}
