import java.util.Arrays;

public class Student extends Customer{

    public String name;

    public Sizes sizes;
    public long id = 0;
    public static long studentID;

    private double DISCOUNT;

    public Student(Sizes size, String name) {
        super(size, name);

    }
    public void printUniqueStudentID(){
        studentID++;
        id = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "DISCOUNT=" + DISCOUNT +
                ", cloths=" + Arrays.toString(cloths) +
                '}';
    }
}
