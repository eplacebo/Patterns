package creational.builder;

public class Complex {
    private String name;
    private int pills;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPills(int pills) {
        this.pills = pills;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "name='" + name + '\'' +
                ", pills=" + pills +
                ", price=" + price +
                '}';
    }
}
