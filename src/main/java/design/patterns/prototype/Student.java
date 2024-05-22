package design.patterns.prototype;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private float psp;
    private String batch;
    private String year;

    public Student(){}

    public Student(Student student) {
        this.batch = student.batch;
        this.year = student.year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPsp() {
        return psp;
    }

    public void setPsp(float psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
