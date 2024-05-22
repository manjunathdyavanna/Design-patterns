package design.patterns.prototype;

public class Test {
    public static void testMain(String[] args){
        Registry registry = new Registry();
        Student aprStudent = new Student();
        aprStudent.setBatch("Apr");
        aprStudent.setYear("2020");
        registry.saveStudent("Apr", aprStudent);

        Student aprStudent2 = registry.getStudent("Apr").clone();
    }


}
