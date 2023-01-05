package com.leet_solns;

public class first_last_34 {
    public int [] searchRange(int [] nums, int target) {
        int[] ans = {-1, -1};

        // check for first occurence of the target
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    int search(int [] nums, int target, boolean findsStartIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;
        int size = nums.length;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                ans = mid;
                if(findsStartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
