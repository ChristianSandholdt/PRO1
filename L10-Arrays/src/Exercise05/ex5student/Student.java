package Exercise05.ex5student;

public class Student {
    private final String name;
    private final int[] grades;// containing the student's grades
    private int gradeCount;// the current number of grades


    private static final int MAX_GRADE_COUNT = 10;// maximum number of grades

    public Student(String name) {
        this.name = name;
        this.grades = new int[Student.MAX_GRADE_COUNT];
        this.gradeCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public int[] getGrades() {
        return this.grades;
    }

    public int getGradeCount() {
        return this.gradeCount;
    }
    public void addGrade(int grade){
        if (gradeCount < MAX_GRADE_COUNT){
            grades[gradeCount++] = grade;
        }
    }
    public double gradeAverage(){
        double sum = 0;
        for (int i = 0; i < gradeCount; i++){
            sum += grades[i];
        }
        return (sum/gradeCount);
    }
    public int maxGrade(){
        int highestGrade = 0;
        for (int i = 0; i < gradeCount; i++){
            if (grades[i] > highestGrade){
                highestGrade = grades[i];
            }
        }
        return highestGrade;
    }
    public int minGrade(){
        int lowestGrade = 12;
        for (int i = 0; i < gradeCount; i++){
            if (grades[i] < lowestGrade){
                lowestGrade = grades[i];
            }
        } return lowestGrade;
    }
    public int[] getActualGrades(){
        int[] actualGrades = new int[gradeCount];
        for (int i = 0; i < gradeCount; i++){
            actualGrades[i] = grades[i];
        }
        return actualGrades;
    }
}
