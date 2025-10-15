package utils;

import javax.swing.*;

public class Utility {
    public static int readInteger(String message){
        //int numero=0;
        try{
            return Integer.parseInt(JOptionPane.showInputDialog(message));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "Error, ingresar otro numero.");

        }
        return 0;


        //return numero;
    }

    public static int[] readIntegerArray(String message, int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = readInteger(message + (i+1));
        }
        return array;
    }

    public static long calculateFactorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static String showArrayInteger(int[] array){
        String  result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i] + " \n";
        }
        return result;
    }

    public static String showArrayLongs(long[] array){
        String  result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i] + " \n";
        }
        return result;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}