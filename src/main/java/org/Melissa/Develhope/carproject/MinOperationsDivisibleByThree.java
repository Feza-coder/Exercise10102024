// You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

// Return the minimum number of operations to make all elements of nums divisible by 3.

public class MinOperationsDivisibleByThree {
    public static int minOperationsDivisibleByThree (int []nums){
        int operations = 0;
        for (int num: nums){
            int remainder = num % 3;
            if (remainder == 1){
                operations += 1;
            } else if (remainder == 2){
                operations += 1;
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 8, 9};
        System.out.println("Minimum operations: " + minOperationsDivisibleByThree(nums));
    }
}