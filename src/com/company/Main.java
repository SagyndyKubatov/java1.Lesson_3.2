package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = {1.1,-7.2,-1.3,1.4,1.5,-2.2,2.5,-6.3,-5.4,5.2,6.8,2.1,8.4,4.4,-5.5};

        int counterPositiveNum = 0;
        int counterNegativeNum = 0;

        double sum1 = 0;
        double sum2 = 0;

        boolean leverArm = false;

        for (double num: array) {
            if (num < 0){
                leverArm = true;
            }else if (leverArm == true && num > 0){
                sum1 = sum1 + num;
                counterPositiveNum++;
            }
            if (num > 0){
                leverArm = true;
            }else if (leverArm == true && num < 0){
                sum2 = sum2 + num;
                counterNegativeNum++;
            }
        }
        System.out.println("Среднее значение положительных чисел: "+sum1/counterPositiveNum);
        System.out.println("Среднее значение отрицательных чисел: "+sum2/counterNegativeNum);
        double sum3 = sum1/counterPositiveNum + sum2/counterNegativeNum;
        System.out.println("Разница положительных и отрицательных чисел: "+ sum3);
        arraySort(array);
    }



    public static void arraySort (double[] arrayToSort){
        
        // Проходим по всему массиву
        // Найти минимальный элемент
        // меняем местами первый и минимальный элемент
        
        //повторяем пока не пройдем по всему массиву.
        
        
        int indexMin;
        for (int index = 0; index < arrayToSort.length-1; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) {
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]){
                    indexMin = indexToScan;
                }
            }
            double temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin] = temp;
        }
        System.out.println(Arrays.toString(arrayToSort));
    }
}
