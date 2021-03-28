public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] array = new int[7][7];

        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[0][3] = 1;
        array[0][4] = 1;
        array[0][5] = 1;
        array[0][6] = 1;
        array[1][0] = 0;
        array[1][1] = 1;
        array[1][2] = 1;
        array[1][3] = 1;
        array[1][4] = 1;
        array[1][5] = 1;
        array[1][6] = 0;
        array[2][0] = 0;
        array[2][1] = 0;
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[2][5] = 0;
        array[2][6] = 0;
        array[3][0] = 0;
        array[3][1] = 0;
        array[3][2] = 0;
        array[3][3] = 1;
        array[3][4] = 0;
        array[3][5] = 0;
        array[3][6] = 0;
        array[4][0] = 0;
        array[4][1] = 0;
        array[4][2] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        array[4][5] = 0;
        array[4][6] = 0;
        array[5][0] = 0;
        array[5][1] = 1;
        array[5][2] = 1;
        array[5][3] = 1;
        array[5][4] = 1;
        array[5][5] = 1;
        array[5][6] = 0;
        array[6][0] = 1;
        array[6][1] = 1;
        array[6][2] = 1;
        array[6][3] = 1;
        array[6][4] = 1;
        array[6][5] = 1;
        array[6][6] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
