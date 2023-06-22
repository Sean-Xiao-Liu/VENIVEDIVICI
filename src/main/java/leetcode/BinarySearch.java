//Given an array of integers nums which is sorted in ascending order, and an int
//eger target, write a function to search target in nums. If target exists, then r
//eturn its index. Otherwise, return -1.
//
// You must write an algorithm with O(log n) runtime complexity.
//
//
// Example 1:
//
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//
//
// Example 2:
//
//
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1

package leetcode;

public class BinarySearch {

    public static int binarySearchOne(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }

    private static int search(int[] nums, int target, int begin, int end){
        if (end < begin) return -1;

        int mid = (begin + end)/2;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] < target){
            return search(nums,target,mid, end);
        } else {
            return search(nums,target,begin, mid-1);
        }
    }

    private static int binarySearchTwo(int[] nums, int target){
        int begin = 0;
        int end = nums.length -1;
        while (begin <= end){ // <= instead of < so that a single number can be used to compare
            int mid = (begin + end)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                begin = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(binarySearchTwo(nums,5));

    }
}
