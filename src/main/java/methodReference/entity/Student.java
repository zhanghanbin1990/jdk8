package methodReference.entity;

/**
 * Created by zhanghanbin on 2017/5/9.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //无意义的方法，因为参数和本身的类没有什么联系，该静态方法放置其他类中照样可以运行，可以作为一种铺助类方法
    public static int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    //无意义的方法
    public static int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    //有意义的方法
    public int compareScore(Student student) {
        return this.getScore() - student.getScore();
    }

    public int compareName(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }

}
