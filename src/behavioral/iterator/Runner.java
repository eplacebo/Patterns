package behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] names = {"command", "interpreter", "chain"};
        Pattern pattern = new Pattern("Behavioral", names);

        Iterator iterator = pattern.getIterator();
        System.out.println("Pattern type: " + pattern.getType());
        System.out.println("Pattern names: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
