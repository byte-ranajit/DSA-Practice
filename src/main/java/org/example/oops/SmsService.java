package org.example.oops;

public class SmsService {

    public static void main(String[] args) {
        boolean str = isPalindrome("ollo");
        System.out.println(str);
    }

    StringBuilder reverseString(){
        String str = "hello";
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            temp.append(str.charAt(i));
        }
        return temp;
    }

    static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    static boolean isPalindrome(String str){
        String temp = new StringBuilder(str).reverse().toString();
        return temp.equals(str);
    }
}
