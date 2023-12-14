package jsonActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader, Student.class);
            System.out.println("---Student Details---");
            System.out.printf("Student Name: %s\nStudent GPA: %.1f\nStudent Major: %s", student.getName(), student.getGPA(), student.getMajor());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
