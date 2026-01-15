package org.example.array;

public class ArrayTestOne {

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static Boolean binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return true;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    //find the largest element in the given array
    // example :
    // input arr[] = {1,2,3,4,5}
    // largest element = 5

    public static int largestElement(int [] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


    //pring 2D array
    public static void printTwoDArray(int [] [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    //copy each element individually one array to another new array

    public static void copyElement(int [] arr){

        int [] CopyElement = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            CopyElement[i] = arr[i];
            System.out.print(CopyElement[i] + " ");
        }
    }


    public static int totalCountOccurance(int [] arr, int target){
        int firstOccurance = firstCountOccurance(arr, target);
        if(firstOccurance == -1){
            return 0;
        }
        int lastOccurance = lastCountOccurance(arr, target);
        return firstOccurance - lastOccurance + 1;
    }

    private static int firstCountOccurance(int [] arr, int target){
        int ans = -1, left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private static int lastCountOccurance(int [] arr, int target){
        int ans = -1, left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
