public class Cloth {

    private String name;

    private double price;

    private Sizes size;


    public Cloth(String name, Sizes sizes, double price) {
        this.name = name;
        this.size = sizes;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }
}
