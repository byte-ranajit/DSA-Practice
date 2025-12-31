package org.example;

import org.example.array.ArrayTestOne;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr [] = {10,30,23,2,4,100,3,28,29,90};
        Arrays.sort(arr);
        System.out.println(ArrayTestOne.binarySearch(arr,10));
    }
}