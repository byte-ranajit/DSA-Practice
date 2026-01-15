package org.example;

import org.example.array.ArrayTestOne;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 40;
        System.out.println(ArrayTestOne.totalCountOccurance(arr, target));
    }
}