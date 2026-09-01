class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;

        // XOR all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Find rightmost set bit
        int rightmostSetBit = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        // Divide into two groups and XOR
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}