package design.patterns.prototype;

import java.util.HashMap;

public class Registry {
    private HashMap<String, Student> students = new HashMap<>();

    public Student getStudent(String batch){
        return students.get(batch);
    }

    public void saveStudent(String batch, Student student){
        students.put(batch, student);
    }
}
