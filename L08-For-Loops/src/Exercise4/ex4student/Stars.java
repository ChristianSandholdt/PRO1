package Exercise4.ex4student;

public class Stars
{

    public void starExB(int rowCount){
        for (int row = 1; row <= rowCount; row++){
            System.out.printf("%2d: ", row);


            int starCount = rowCount - row + 1;
            int dashCount = rowCount - starCount;


            for (int i = 1; i <= starCount; i++){
                System.out.print("*");
            }
            for (int i = 1; i <= dashCount; i++){
                System.out.print("-");
            }
            System.out.println();

        }
    }


    public void starExA(int rowCount)
    {
        for (int row = 1; row <= rowCount; row++) {
            System.out.printf("%2d: ", row);
            int starCount = rowCount - row + 1;
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= starCount; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= dashCount; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

}
