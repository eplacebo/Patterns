package creational.prototype;

public class Tablet implements Copyable {
    private String name;
    private int weight;

    public Tablet(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Object copy() {
        return new Tablet(name, weight);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
