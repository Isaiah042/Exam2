public class Main {
    public static void main(String[] args) {
    Cloth cloth1 = new Cloth("Jeans", Sizes.LARGE, 15.99);
    Cloth cloth2 = new Cloth("Shirt", Sizes.MEDIUM, 10.99);
    Cloth cloth3 = new Cloth("Hat", Sizes.SMALL, 5.99);
    Cloth[] cloths = {cloth1, cloth2, cloth3};
    double totalPrice = ShopApp.calculateSubTotal(cloths);
        System.out.println(totalPrice);

        Student student = new Student(Sizes.XLARGE, "Isaiah");
        Student student2 = new Student(Sizes.LARGE, "Isaiah G");
        student.printUniqueStudentID();
        System.out.println(student.studentID);
        student2.printUniqueStudentID();
        System.out.println(student2.studentID);
        System.out.println(student.studentID);

        student2.toString();















    }

}
