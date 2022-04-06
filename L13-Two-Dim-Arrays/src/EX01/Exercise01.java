package EX01;



public class Exercise01 {

    public static void main(String[] args) {
        int [] [] arrayEx1 =
                {
                        {0,4,3,9,6},
                        {1,3,5,2,2},
                        {3,3,1,0,1},
                        {0,0,9,7,1},
                };
        print(arrayEx1);
        System.out.println(sumRow(arrayEx1,2));
        System.out.println(sumCol(arrayEx1, 1));
        System.out.println(sum(arrayEx1));
    }
    public static void print (int[][] arrayEx1){
        for (int row = 0; row < arrayEx1.length; row++){
            for (int col = 0; col < arrayEx1[row].length; col++){
                System.out.printf("%5d ", arrayEx1[row][col]);
            }
            System.out.println();
        }
    }
    public static int getValueAt(int[][] arrayEx1, int row, int col){
        return arrayEx1[row][col];
    }
    public static void setValueAt(int[][] arrayEx1, int row, int col, int value){
        arrayEx1[row][col] = value;
    }
    public static int sumRow(int[][] arrayEx1, int row){
        int sum = 0;
        for (int col = 0; col < arrayEx1[row].length; col++){
            sum += arrayEx1[row][col];
        }
        return sum;
    }
    public static int sumCol(int[][] arrayEx1, int col){
        int sum = 0;
        for (int row = 0; row < arrayEx1.length; row++){
            sum += arrayEx1[row][col];
        }
        return sum;
    }
    public static int sum(int[][] arrayEx1) {
        int sum = 0;
        for (int row = 0; row < arrayEx1.length; row++) {
            for (int col = 0; col < arrayEx1[row].length; col++) {
                sum += arrayEx1[row][col];}
        }
        return sum;
    }}
