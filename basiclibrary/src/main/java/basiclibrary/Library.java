/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Rolling Dice");
        roll(4);
        System.out.println("-----------------------------");

        System.out.println("Contains Duplicate");
        int[] array = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        int[] array2 = {1,2,3,4,5,6,7};
        System.out.println(containsDuplicates(array));
        System.out.println(containsDuplicates(array2));
        System.out.println("-----------------------------");


        System.out.println("Calculating Average");
        int[] array3 = {2,5,8,12,51,25};
        System.out.println(calcAverage(array3));
        System.out.println("double : " + String.format("%.2f", calcAverage(array3)));
        System.out.println("-----------------------------");


        System.out.println("Array of Arrays");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
                {42, 50, 47, 31, 58, 60, 40}
        };

        System.out.println(Arrays.toString(calcAoA(weeklyMonthTemperatures)));


    }

    public static int[] roll(int n){
        int [] valArr = new int[n];
        for(int i = 0; i < n; i++){
            valArr[i] = (int)Math.ceil(Math.random() * 6);
        }
        System.out.println(Arrays.toString(valArr));
        return (int[]) valArr;
    }

    public static boolean containsDuplicates(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(temp == arr[j]) return true;
            }
        }
        return false;
    }

    public static float calcAverage (int[] arr){
        int val = 0;
        for(int i : arr){
            val += i;
        }

        return (float) val/arr.length;
    }

    public static int[] calcAoA(int [][] arr){
        int [] newArr = new int [arr[0].length];
        float lowestAvg = calcAverage(arr[0]);
        for(int[] i : arr){
            if(calcAverage(i) < lowestAvg){
//                System.out.println(Arrays.toString(i));
                lowestAvg = calcAverage(i);
                newArr = i;
            }
        }
        return newArr;
    }




}
