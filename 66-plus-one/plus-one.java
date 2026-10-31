class Solution {
    public int[] plusOne(int[] digits) { 
        for (int i = digits.length - 1; i >= 0; i --) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }

        int nums[] = new int[digits.length + 1];
        nums[0] = 1;
        for (int i = 1; i < nums.length; i ++) {
            nums[i] = 0;
        }

        return nums;
    }
}