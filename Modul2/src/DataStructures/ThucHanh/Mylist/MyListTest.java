package DataStructures.ThucHanh.Mylist;

import DataStructures.ThucHanh.Mylist.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(3);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(4);
        listInt.add(9);
        listInt.add(8);
        listInt.add(8);
        listInt.add(8);
        System.out.println("element 4: "+listInt.get(4));
        System.out.println("element 1: "+listInt.get(1));
        System.out.println("element 2: "+listInt.get(2));
        System.out.println("element 11: "+listInt.get(11));
        listInt.get(-1);
        System.out.println("element -1: " + listInt.get(-1));
    }
}
