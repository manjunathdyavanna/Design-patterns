package design.patterns.prototype;

public class IntelligenStudent extends Student{
    public int iq;

    public IntelligenStudent(IntelligenStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligenStudent clone(){
        return new IntelligenStudent(this);
    }
}
