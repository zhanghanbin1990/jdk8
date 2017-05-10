package methodReference.entity;

/**
 * Created by zhanghanbin on 2017/5/9.
 */
public class StudentCompare {

    public int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
