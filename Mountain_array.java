package com.leet_solns;

public class Mountain_array {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end -start)/2;
            if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int [] arr = {0,2,5,6,8,10,1232325,12456,9,8,7,4,1,-1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
