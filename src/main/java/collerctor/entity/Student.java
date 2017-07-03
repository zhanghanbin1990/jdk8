package collerctor.entity;

/**
 * Created by zhanghanbin on 2017/5/22.
 */
public class Student {
    private String name;
    private Double score;
    private String classes;

    public Student(String name, Double score, String classes) {
        this.name = name;
        this.score = score;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", classes='" + classes + '\'' +
                '}';
    }
}
