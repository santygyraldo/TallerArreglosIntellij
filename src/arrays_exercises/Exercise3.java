package arrays_exercises;

import javax.swing.*;
//  Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos entre 100 y 300.
//Luego mostrarlos en pantalla.
public class Exercise3 {
    public static void execute() {
        int[] primes = new int[10];
        int count = 0;
        int number = 100;

        while (count < 10 && number <= 300) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        StringBuilder result = new StringBuilder("Los 10 números primos entre 100 y 300 son:\n");
        for (int i = 0; i < primes.length; i++) {
            result.append(primes[i]).append(i < primes.length - 1 ? ", " : ".");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }

    // Método para verificar si un número es primo
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
