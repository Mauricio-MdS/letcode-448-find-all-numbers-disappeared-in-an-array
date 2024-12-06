import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        Arrays.sort(nums);
        int candidate = 1;
        for (int n : nums) {
            while (n > candidate) {
                disappearedNumbers.add(candidate);
                candidate++;
            }

            if (n == candidate) candidate++;
        }

        while (candidate <= nums.length) {
            disappearedNumbers.add(candidate);
            candidate++;
        }

        return disappearedNumbers;
    }
}