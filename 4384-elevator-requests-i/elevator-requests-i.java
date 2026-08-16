class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int curr = 0;
        int t= 0;
        for(int floor:requests){
            t+=Math.abs(curr-floor);
            curr = floor;
        }
        return t;
    }
}