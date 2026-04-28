import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int target = 0;
        System.out.println("Give me a target number");
        target = Integer.parseInt(in.nextLine());
        int[] array  = {2, 7, 11, 15};
        int sum = array[0] + array[1];
        System.out.println(sum);
        System.out.println(target);
    }
}



// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:

// Input: nums = [3,2,4], target = 6

// Output: [1,2]

// Example 3:

// Input: nums = [3,3],target = 6
// Output: [0,1]
