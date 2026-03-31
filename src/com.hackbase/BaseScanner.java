package com.hackbase;

import java.util.Scanner;

public class BaseScanner implements ScannerService {
    Scanner sc = new Scanner(System.in);
    @Override
    public int getInt() {
        return Integer.parseInt(sc.nextLine());
    }
    @Override
    public String getString() {
        ScannerService.super.print();
        return sc.nextLine();
    }
    @Override
    public char getChar() {
        return sc.nextLine().charAt(0);
    }

    public int[] getIntArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        sc.nextLine();
        return arr;
    }
    @Override
    public String[] getStringArray(int len) {
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public <T> String displayArray(T[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                str.append(arr[i]).append(", ");
            else
                str.append(arr[i]);
        }
        str.append("]");
        return str.toString();
    }

    public String displayArray(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                str.append(arr[i]).append(", ");
            else
                str.append(arr[i]);
        }
        str.append("]");
        return str.toString();
    }

    public String displayArray(long[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                str.append(arr[i]).append(", ");
            else
                str.append(arr[i]);
        }
        str.append("]");
        return str.toString();
    }

    public String displayArray(double[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                str.append(arr[i]).append(", ");
            else
                str.append(arr[i]);
        }
        str.append("]");
        return str.toString();
    }

    public String displayArray(char[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                str.append(arr[i]).append(", ");
            else
                str.append(arr[i]);
        }
        str.append("]");
        return str.toString();
    }

    public String displayArray(boolean[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                str.append(arr[i]).append(", ");
            else
                str.append(arr[i]);
        }
        str.append("]");
        return str.toString();
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

//    public ScannerClass getObj() {
//        return this;
//    }

}
