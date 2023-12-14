package jsonActivity;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student student = new Student("Jason Doodlebob", "CS", 3.5);
            Gson gson = new Gson();
            String jsonString = gson.toJson(student);
            FileWriter fileWriter = new FileWriter("student.json");
            fileWriter.write(jsonString);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
