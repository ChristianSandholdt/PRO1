package Exercise03;

public class Copier {
    private int paperCount;
    private boolean paperJam;

    public Copier() {
        paperCount = 0;
    }

    public Copier(int paperCount) {
        this.paperCount = paperCount;
    }

    public String getPaperCount() {
        return "Remaining sheets of paper: " + paperCount;
    }


    public void insertPaper(int amount) {
        if (paperCount + amount <= 500) {
            paperCount = amount + paperCount;
        } else {
            System.out.println("error: Too much paper in printer");
        }
    }

    public void makeCopy() {
        System.out.print("Copy made. Remaining paper: ");
        if (paperCount == 0 || paperJam) {
            System.out.println("error: no paper remains please insert paper or printer is jammed");
        } else if (paperCount > 0) {
            System.out.println(paperCount--);
        } else
            System.out.println("Error printer is jammed");

    }



    public void makePaperJam(){
        paperJam = true;
        System.out.println("Error printer is jammed");
    }
    public void fixJam(){
        paperJam = false;
        System.out.println("Error has been fixed and printer can now print again");
    }

}
