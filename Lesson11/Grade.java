package Lessons.Lesson11;

public class Grade {
    private final int grade; //not a variable anymore with FINAL for immutable fields

    public Grade(int grade) {
        this.grade = grade;
    }

    public boolean isPassingGrade(){
        return grade >=3;
    }

    public static boolean isPassingGoodGrade(int g){ //static works without created object
        return g >=3; // return boolean is it >=3???
    }
}
