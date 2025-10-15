package arrays_exercises;

import utils.Utility;

import javax.swing.*;

public class Exercise10 {
    public static void execute() {
        int N = Utility.readInteger("Ingrese la cantidad de estudiantes (máximo 50): ");
        while (N <= 0 || N > 50) {
            N = Utility.readInteger("Valor inválido. Ingrese un número entre 1 y 50:");
        }

        int[] cedulas = new int[N];
        int[] sexos = new int[N];     // 1 = Hombre, 2 = Mujer
        int[] trabaja = new int[N];   // 1 = Sí, 2 = No
        int[] sueldos = new int[N];   // Si no trabaja, será 0

        for (int i = 0; i < N; i++) {
            cedulas[i] = Utility.readInteger("Estudiante " + (i + 1) + ": Ingrese cédula:");
            sexos[i] = Utility.readInteger("Sexo (1 = Hombre, 2 = Mujer):");
            while (sexos[i] != 1 && sexos[i] != 2) {
                sexos[i] = Utility.readInteger("Valor inválido. Ingrese 1 para Hombre, 2 para Mujer:");
            }

            trabaja[i] = Utility.readInteger("¿Trabaja? (1 = Sí, 2 = No):");
            while (trabaja[i] != 1 && trabaja[i] != 2) {
                trabaja[i] = Utility.readInteger("Valor inválido. Ingrese 1 para Sí, 2 para No:");
            }

            if (trabaja[i] == 1) {
                sueldos[i] = Utility.readInteger("Ingrese sueldo:");
            } else {
                sueldos[i] = 0;
            }
        }

        int totalHombres = 0, totalMujeres = 0;
        int hombresTrabajan = 0, mujeresTrabajan = 0;
        int sumaSueldosHombres = 0, sumaSueldosMujeres = 0;

        for (int i = 0; i < N; i++) {
            if (sexos[i] == 1) {
                totalHombres++;
                if (trabaja[i] == 1) {
                    hombresTrabajan++;
                    sumaSueldosHombres += sueldos[i];
                }
            } else {
                totalMujeres++;
                if (trabaja[i] == 1) {
                    mujeresTrabajan++;
                    sumaSueldosMujeres += sueldos[i];
                }
            }
        }

        double porcentajeHombres = (totalHombres * 100.0) / N;
        double porcentajeMujeres = (totalMujeres * 100.0) / N;

        double porcentajeHombresTrabajan = totalHombres > 0 ? (hombresTrabajan * 100.0) / totalHombres : 0;
        double promedioSueldoHombres = hombresTrabajan > 0 ? (sumaSueldosHombres * 1.0) / hombresTrabajan : 0;

        double porcentajeMujeresTrabajan = totalMujeres > 0 ? (mujeresTrabajan * 100.0) / totalMujeres : 0;
        double promedioSueldoMujeres = mujeresTrabajan > 0 ? (sumaSueldosMujeres * 1.0) / mujeresTrabajan : 0;

        String resultado = String.format(
                "Porcentaje de hombres: %.2f%%\n" +
                        "Porcentaje de mujeres: %.2f%%\n\n" +
                        "Porcentaje de hombres que trabajan: %.2f%%\n" +
                        "Sueldo promedio de hombres que trabajan: %.2f\n\n" +
                        "Porcentaje de mujeres que trabajan: %.2f%%\n" +
                        "Sueldo promedio de mujeres que trabajan: %.2f",
                porcentajeHombres, porcentajeMujeres,
                porcentajeHombresTrabajan, promedioSueldoHombres,
                porcentajeMujeresTrabajan, promedioSueldoMujeres
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
