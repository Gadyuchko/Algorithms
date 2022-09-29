import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    static char[][]grid1 ={{'1','1','1','0'},{'1','1','1','0'}, {'1','0','0','0'}, {'1','1','0','0'}, {'0','0','0','0'}};
    static char[][]grid2 ={{'1','1','1','1','0'},{'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
    public static void main(String[] args) {
        System.out.println(numIslands(grid2));
    }
    static int numIslands(char[][] grid) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<grid.length; i++)
            for(int y=0; y<grid[i].length; y++) {
                if (grid[i][y] == '1') {
                    queue.add(new int[]{i,y});
                    grid[i][y]='2';
                    while (!queue.isEmpty()) {
                        int[]pos = queue.remove();
                        if (isLand(grid, pos[0] + 1, pos[1])) {
                            queue.add(new int[]{pos[0] + 1,pos[1]});
                            grid[pos[0] + 1][pos[1]] = '2';
                        }
                        if (isLand(grid, pos[0], pos[1] + 1)) {
                            queue.add(new int[]{pos[0],pos[1]+1});
                            grid[pos[0]][pos[1] + 1] = '2';
                        }
                        if (isLand(grid, pos[0] - 1, pos[1])) {
                            queue.add(new int[]{pos[0] - 1,pos[1]});
                            grid[pos[0] - 1][pos[1]] = '2';
                        }
                        if (isLand(grid, pos[0], pos[1] - 1)) {
                            queue.add(new int[]{pos[0],pos[1]-1});
                            grid[pos[0]][pos[1] - 1] = '2';
                        }
                        if (queue.isEmpty()) {
                            count += 1;
                        }
                    }
                }
            }
        return count;
    }

    static boolean isLand( char[][] grid, int i, int y){
        if(i<grid.length && i>= 0
            && y<grid[0].length && y>=0)
            if(grid[i][y] == '1' )
                return true;
        return false;
    }


}
