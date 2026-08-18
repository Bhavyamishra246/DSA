class Solution {
    public int minOperations(String s) {

        int n = s.length();
        int answer = Integer.MAX_VALUE;

        for (int k = 0; k < n; k++) {

            int operations = k;

            for (int i = 0; i < n / 2; i++) {

                int j = n - 1 - i;

                int a1 = s.charAt(i) - 'a';
                int a2 = s.charAt(j) - 'a';

                int cost1 = Math.abs(a1 - a2);
                int cost2 = 26 - Math.abs(a1 - a2);

                operations += Math.min(cost1, cost2);
            }

            answer = Math.min(answer, operations);

            s = s + s.charAt(0);
            s = s.substring(1);
        }

        return answer;
    }
}