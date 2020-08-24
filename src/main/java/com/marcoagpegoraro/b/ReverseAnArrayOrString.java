package com.marcoagpegoraro.b;


public class ReverseAnArrayOrString {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = 8;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(arr[0]);
    }
}
