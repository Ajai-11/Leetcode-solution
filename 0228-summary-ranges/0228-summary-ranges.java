class Solution {
    public static String formatRange(int start, int end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }
    public List<String> summaryRanges(int[] nums) {
      List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        
        int start = nums[0];
        int end = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                result.add(formatRange(start, end));
                start = nums[i];
                end = nums[i];
            }
        }
        result.add(formatRange(start, end));
        
        return result;
    }
}