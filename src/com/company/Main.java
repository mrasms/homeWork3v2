package com.company;

public class Main {

    public static void main(String[] args) {

        double[] fractionalNumbers = new double[15]; // 1) заполнение массива руками
        fractionalNumbers[0] = -7.0;
        fractionalNumbers[1] = 7.0;
        fractionalNumbers[2] = -6.0;
        fractionalNumbers[3] = 6.0;
        fractionalNumbers[4] = -5.4;
        fractionalNumbers[5] = 5.5;
        fractionalNumbers[6] = -4.3;
        fractionalNumbers[7] = 4.9;
        fractionalNumbers[8] = 3.0;
        fractionalNumbers[9] = 3.10;
        fractionalNumbers[10] = 2.0;
        fractionalNumbers[11] = -2.9;
        fractionalNumbers[12] = 1.0;
        fractionalNumbers[13] = 1.73;
        fractionalNumbers[14] = 0.0;
        //System.out.println(Arrays.toString(fractionalNumbers)); //строка для удобства проверки
        double sumValues = 0.0;
        int trueConditions = 0;
        for (double currentElement : fractionalNumbers) {

            if (currentElement <= 0) {
                continue;
            } else if (currentElement > 0) {
                sumValues = currentElement + sumValues;
                trueConditions++;
            }

        }
        double average = sumValues / trueConditions;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа массива fractionalNumbers = " + average);
        //System.out.println(forMath); для проверки
        //System.out.println(forMath2); для проверки
//______________________________________________________________________________________________________________


        double[] fractionalNumbers2 = new double[15]; // 2) вариант заполнения массива рандомными значениями
        for (int i = 0; i < fractionalNumbers2.length; i++) {
            fractionalNumbers2[i] = (int) Math.round((Math.random() * 15) - 10);
            // System.out.println(fractionalNumbers2[i]); для проверки вручную
        }
        double sumValues2 = 0.0;
        int trueConditions2 = 0;
        for (double currentElement2 : fractionalNumbers2) {

            if (currentElement2 <= 0) {
                continue;
            } else if (currentElement2 > 0) {
                sumValues2 = currentElement2 + sumValues2;
                trueConditions2++;
            }

        }
        double average2 = sumValues2 / trueConditions2;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа массива fractionalNumbers2 = " + average2);
    }
}


