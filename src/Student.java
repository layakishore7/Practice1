import java.util.List;

public class Student {

    private String name;

    private List<String> subjects;
    private  List<Double> marks;


    public Student(String name, List<String> subjects, List<Double> marks) {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }


    public double calculateAverage(){
        if (marks.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        for (Double mark : marks){
            sum+=mark;
        }
        return sum/marks.size();
    }
}
