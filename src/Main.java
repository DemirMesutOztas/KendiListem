import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Listem<Integer> l1 = new Listem<>();
        Listem<Integer> l2 = new Listem<>();
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
        System.out.println(l1.indexOf(1500));
        System.out.println(l1.lastIndexOf(1500));
        System.out.println(l2.isEmpty());
        Object [] in = l1.toArray();
        System.out.println(in[0]);
        Listem t2 = new Listem<>();
        t2 = l1.sublist(0,3);
        System.out.println(t2.toString());

    }
}