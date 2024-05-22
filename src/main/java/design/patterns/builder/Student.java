package design.patterns.builder;

public class Student {
    private int id;
    private float percentage;
    private String name;
    private int age;

    private Student(StudentHelper studentHelper){
        this.id = studentHelper.id;
        this.age = studentHelper.age;
        this.name = studentHelper.name;
        this.percentage = studentHelper.percentage;
    }

    public static StudentHelper builder(){
        return new StudentHelper();
    }

    public static class StudentHelper{
        private int id;
        private float percentage;
        private String name;
        private int age;

        public StudentHelper id(int id) {
            this.id = id;
            return this;
        }

        public StudentHelper percentage(float percentage) {
            this.percentage = percentage;
            return this;
        }

        public StudentHelper name(String name) {
            this.name = name;
            return this;
        }

        public StudentHelper age(int age) throws Exception {
            if(age<18)
                throw new Exception("Age should be greater than 18");
            this.age = age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
