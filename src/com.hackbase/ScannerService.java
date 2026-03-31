package com.hackbase;

public interface ScannerService {
    int getInt();

    String getString();

    char getChar();

    int[] getIntArray(int len);

    String[] getStringArray(int len);

    <T> String displayArray(T[] arr);

    String displayArray(int[] arr);

    String displayArray(long[] arr);

    String displayArray(double[] arr);

    String displayArray(char[] arr);

    String displayArray(boolean[] arr);

    void mergeSort(int[] arr, int left, int right);
    default void print(){
        System.out.println("hi");
    }
}
