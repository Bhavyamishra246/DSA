class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(1, k, n, current, ans);

        return ans;
    }

    void backtrack(int start, int k, int n,
                   List<Integer> current,
                   List<List<Integer>> ans) {
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (k == 0 || n <= 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            current.add(i);
            backtrack(i + 1, k - 1, n - i, current, ans);
            current.remove(current.size() - 1);
        }
    }
}