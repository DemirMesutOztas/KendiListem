public class Main {
    public static void main(String[] args) {

        Listem<Integer> l1 = new Listem<>();
        l1.add(5);
        l1.printDizi();
        l1.getCapacity();
        l1.size();
        l1.add(35);
        l1.add(52);
        l1.add(15);
        l1.add(45);
        l1.add(225);
        l1.add(1115);
        l1.add(555);
        l1.printDizi();
        l1.getCapacity();
        l1.size();
        l1.add(0);
        l1.add(10);
        l1.printDizi();
        l1.getCapacity();
        l1.size();
        l1.add(11);
        l1.printDizi();
        l1.getCapacity();
        l1.size();
        l1.add(100);
        l1.getCapacity();
        l1.size();
        l1.add(5);
        l1.size();
        l1.getCapacity();
        l1.printDizi();
    }
}