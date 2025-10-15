package arrays_exercises;

import utils.Utility;

import javax.swing.*;
import java.util.Scanner;
// Leer 10 números enteros, almacenarlos en un arreglo y calcularle el factorial a cada uno de los
//números leídos almacenándolos en otro arreglo, luego mostrar en pantalla cada número con su
//factorial.
public class Exercise8 {
    public static void execute() {
        int size = Utility.readInteger("Ingrese la cantidad de");
        int[] numeros = Utility.readIntegerArray("Ingrese número ",size);
        ///  la parte del factorial
        long[] factorials = new long[size];
        for(int i=0; i<size; i++) {
            factorials[i] = Utility.calculateFactorial(numeros[i]);
        }
        JOptionPane.showMessageDialog(null,
                Utility.showArrayLongs(factorials));


    }
}
