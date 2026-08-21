class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        fun(candidates, target, 0, new ArrayList<>(), ans);
        
        return ans;
    }

    void fun(int[] candidates, int target, int start,
             List<Integer> output, List<List<Integer>> ans) {
        
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return ;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
               continue;
            }

            if (candidates[i] > target) {
                break;
            }

            output.add(candidates[i]);
            fun(candidates, target - candidates[i], i + 1,
                output, ans);

            output.remove(output.size() - 1);
        }
    }
}