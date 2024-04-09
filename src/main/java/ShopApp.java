public class ShopApp {

    public static double calculateSubTotal(Cloth[] cloths) {
        double total = 0.0;
        for (Cloth cloth : cloths) {
            total += cloth.getPrice();
        }
        return total;
    }

}