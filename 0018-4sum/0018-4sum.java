class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                Set<Long> seen = new HashSet<>(); // store long

                for (int k = j + 1; k < nums.length; k++) {

                    long sum3 = (long) nums[i] + nums[j] + nums[k];
                    long fourth = (long) target - sum3;

                    if (seen.contains(fourth)) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(quad);
                        result.add(quad);
                    }

                    seen.add((long) nums[k]); // store as long
                }
            }
        }

        return new ArrayList<>(result);
    }
}