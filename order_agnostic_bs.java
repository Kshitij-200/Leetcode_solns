package com.leet_solns;

public class order_agnostic_bs {
    public static int agnostic_bs(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] < arr[end]){
            while (start <= end){
                int mid = start + (end - start)/2;
                if (target > arr[mid]){
                    start = mid + 1; //checking right
                } else if (target < arr[mid]) {
                    end = mid - 1; // checking left
                }
                else {
                    return mid;
                }
            }
        }
        else {
            while (start <= end){
                int mid = start + (end - start)/2;
                if (target > arr[mid]){
                    end = mid - 1;  // checking left
                } else if (target < arr[mid]) {
                    start = mid + 1; // checking right
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {50, 20 ,19 , 10,5,4,2,0,-120000};
        int ans = agnostic_bs(arr,-120000);
        System.out.println(ans);

    }
}
