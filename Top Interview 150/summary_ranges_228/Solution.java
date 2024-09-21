package summary_ranges_228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> rangesList = new ArrayList<>();
        StringBuilder range = new StringBuilder();

        if (nums.length == 0) {
            return rangesList;
        }

        int firstValue = nums[0];
        int secondValue = Integer.MIN_VALUE;
        range.append(firstValue);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                if (secondValue != Integer.MIN_VALUE) {
                    range.append("->").append(secondValue);
                    secondValue = Integer.MIN_VALUE;
                }
                rangesList.add(range.toString());
                range = new StringBuilder();
                firstValue = nums[i];
                range.append(firstValue);
            } else {
                secondValue = nums[i];
            }
        }

        if (secondValue != Integer.MIN_VALUE) {
            range.append("->").append(secondValue);
        }
        rangesList.add(range.toString());

        return rangesList;
    }
}
