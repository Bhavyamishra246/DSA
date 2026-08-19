class Solution {

    void fun(List<Integer> input, List<Integer> output,
             List<List<Integer>> ans,
             Map<List<Integer>, Boolean> map) {

        if (!map.containsKey(output)) {
            ans.add(new ArrayList<>(output));
            map.put(new ArrayList<>(output), true);
        }

        if (input.size() == 0) return;

        for (int i = 0; i < input.size(); i++) {

            List<Integer> ip = new ArrayList<>(input);
            List<Integer> op = new ArrayList<>(output);

            op.add(ip.get(i));
            ip.subList(0, i + 1).clear();

            fun(ip, op, ans, map);  
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        Map<List<Integer>, Boolean> map = new HashMap<>();

        for (int a : nums) {
            input.add(a);
        }

        fun(input, output, ans, map);  

        return ans;
    }
}