package medium.MinimumCostForTickets983;

public class Solution {
    public int minCostTickets(int[] days, int[] costs) {
        boolean[] travelDays = new boolean[366];
        for (int day : days) {
            travelDays[day] = true;
        }

        int[] dp = new int[366];

        for (int i = 1; i <= 365; i++) {
            if (!travelDays[i]) {
                dp[i] = dp[i - 1];
            } else {
                int option1 = dp[i - 1] + costs[0];
                int option2 = dp[Math.max(0, i - 7)] + costs[1];
                int option3 = dp[Math.max(0, i - 30)] + costs[2];
                dp[i] = Math.min(Math.min(option1, option2), option3);
            }
        }

        return dp[365];
    }
}