package jsonActivity;

public class Student {
    private String name, major;
    private double gpa;
    Student(String Name, String Major, double GPA){
        this.gpa = GPA;
        this.major = Major;
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA(){
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
