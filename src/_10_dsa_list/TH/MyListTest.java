package _10_dsa_list.TH;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer>listInteger=new MyList<>();

        listInteger.addLast(5);
        listInteger.addLast(5);
        listInteger.addLast(3);
        listInteger.addLast(2);
        listInteger.addLast(1);
        listInteger.addLast(1);

        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(7));
        System.out.println(listInteger.get(3));
    }
}
