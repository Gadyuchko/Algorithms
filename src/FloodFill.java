import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] a={{0,0,0},{1,0,0}};
        System.out.println(Arrays.deepToString(floodFill(a, 1, 0, 2)));
    }
    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int d = image[sr][sc];
       paint(image,sr,sc,d,color);
       return image;
    }

    static void paint(int[][] image, int sr, int sc, int colorP, int colorN) {
        if (sr<0 || sr>=image.length || sc<0 || sc>=image[sr].length || colorN==colorP){
            return;
        }
        if(image[sr][sc]!=colorP){
            return;
        }
        image[sr][sc]=colorN;
        paint(image,sr+1, sc, colorP, colorN);
        paint(image,sr-1, sc, colorP, colorN);
        paint(image,sr, sc+1, colorP, colorN);
        paint(image,sr, sc-1, colorP, colorN);
    }

}
