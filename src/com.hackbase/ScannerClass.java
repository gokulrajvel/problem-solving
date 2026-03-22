package com.hackbase;

import java.util.Scanner;

public class ScannerClass {
    Scanner sc = new Scanner(System.in);

    public int getInt() {
        return Integer.parseInt(sc.nextLine());
    }

    public String getString() {
        return sc.nextLine();
    }

    public char getChar() {
        return sc.nextLine().charAt(0);
    }

    public int[] getIntArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        return arr;
    }

    public String[] getStringArray(int len) {
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public <T> void displayArray(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i]);
        }
        System.out.print("]");
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
}
