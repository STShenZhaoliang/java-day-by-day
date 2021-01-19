import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add(23);
        al.add(34);
        al.add(45);
        al.add(56);
        al.add(67);
        al.add(78);

        System.out.println(al);

        al.add(0, 89);
        System.out.println(al);

        al.remove(1);
        System.out.println(al);

        System.out.println("al.size: " + al.size());
        System.out.println("al.get1: " + al.get(1));
        System.out.println("al.set1: " + al.set(1, 100));
        System.out.println("al.get1: " + al.get(1));

        al.clear();
        System.out.println(al);
    }
}
