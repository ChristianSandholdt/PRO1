package Exercise03;

public class CopierApp {
    public static void main(String[] args) {
        Copier brother = new Copier(10);
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();
        brother.makeCopy();

        brother.insertPaper(5);
        System.out.println(brother.getPaperCount());
        brother.insertPaper(5);
        System.out.println(brother.getPaperCount());

        brother.makePaperJam();
        brother.makeCopy();
        brother.makeCopy();

        brother.fixJam();


    }
}
