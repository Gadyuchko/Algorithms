public class UniquePaths {

    public static void main(String[] args) {
        System.out.println(uniquePaths(4,4));
    }
    static int uniquePaths(int m, int n) {
        if(n ==0 || m==0){
            return 0;
        }
        int [][] grid = new int [m+1][n+1];
        grid[1][1]=1;
            for (int i=0; i<=m; i++){
                for(int y=0; y<=n; y++){
                    int c = grid[i][y];
                    if(i<m){
                        grid[i+1][y] += c;
                    }
                    if(y<n) {
                        grid[i][y + 1] += c;
                    }
                }
            }
            return grid[m][n];
    }
}
