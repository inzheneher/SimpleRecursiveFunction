package com.mav;

public class SimpleRecursiveFunction {

    public int recursiveSum(int[] arr, int arrLength) {
        if (arrLength == 0) {
            return arr[arrLength];
        } else {
            return arr[arrLength] + recursiveSum(arr, arrLength - 1);
        }
    }

    public int[] returnArray() {
        int[] arr = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public int[] returnArray(int amountOfNumbers) {
        int[] arr = new int[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static void main(String[] args) {
        SimpleRecursiveFunction recursiveFunction = new SimpleRecursiveFunction();
        int[] arr = recursiveFunction.returnArray();
        System.out.println(recursiveFunction.recursiveSum(arr, arr.length - 1));
    }
}