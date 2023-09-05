import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Listem<Integer> l1 = new Listem<>();
        Listem<Integer> l2 = new Listem<>();
        l1.add(5);
        l1.add(45);
        l1.add(35);
        l1.add(52);
        l1.add(100);
        l1.add(200);
        l1.size();
        l1.getCapacity();
        System.out.println(l1.toString());
        l1.remove(2);
        System.out.println(l1.toString());

        l2 = l1.sublist(2,3);

        System.out.println(l2.toString());




    }
}