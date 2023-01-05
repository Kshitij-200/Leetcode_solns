package com.leet_solns;

public class floor_no {
    public static int floor(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int [] arr = {5,10,15,20,25,30};
        int ans = floor(arr,1);
        System.out.println(ans);
    }
}
