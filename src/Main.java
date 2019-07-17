public class Main {

    public static void main(String[] args) {


    }

    public static long stairsIn20(int[][] stairs) {
        long stairsIn1 = 0;
        for (int i = 0; i < stairs.length; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                stairsIn1 += stairs[i][j];
            }
        }
        return stairsIn1 * 20;
    }
}
