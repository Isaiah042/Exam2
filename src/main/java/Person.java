public abstract class Person {

    private String name;

    private String size;

    public Person(String size, String name){
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public abstract void printinfo();


}
