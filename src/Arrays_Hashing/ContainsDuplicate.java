package Arrays_Hashing;

/*
    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        BruteForceMethod(nums);
        SortingMethod(nums);
        HashsetMethod(nums);
    }

    /*
    Hashset Method:
        Create a Hashset and ask if the value exits ?
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    private static void HashsetMethod(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums)
        {
            if (set.contains(num))
                System.out.println("Duplicated");
            else
                set.add(num);
        }
    }

    /*
    Sorting:
        Time complexity: O(nlogn)
        Space complexity: O(n)
     */

    private static void SortingMethod(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i=1; i<n; i++){
            if (nums[i] == nums[i-1])
            {
                System.out.println("Duplicate element");
            }
        }
    }

    /*
    Brute Force :
        Time complexity : O(n) - for each number
        Overall Time complexity : O(n^2)
        Space complexity : O(1)
    */

    private static void BruteForceMethod(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate Found at index " + i + " " + j);
                    return;
                }

            }
        }
        System.out.println("No Duplicates Found");
    }
}

