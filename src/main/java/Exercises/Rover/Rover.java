public class Rover {

    public static void main(String[] args) {

        int[][] map = new int[5][5];

        if(map == null || map.length == 0);

        int m = map.length;
        int n = map[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = map[0][0];

        for(int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + map[0][i];
        }
        for(int j = 1; j < m; j++) {
            dp[j][0] = dp[j - 1][0] + map[j][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = dp[i][j - 1] + map[i][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + map[i][j];
                }
            }
        }
    }
}
