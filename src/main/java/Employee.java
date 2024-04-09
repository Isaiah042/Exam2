public class Employee extends Customer implements Payable{

    protected double DISCOUNT;

    public Employee(String size, String name) {
        super(Sizes.valueOf(size), name);
    }


    @Override
    public void calculatePay() {

    }
}
