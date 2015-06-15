package ba.bitcamp.week5.day1;

import java.io.ObjectInputStream.GetField;

public class BagMain {

public static void main(String[] args) {

    Bag b = new Bag(40);


    System.out.println(b.getMaxCapacity());
    b.add(20);
    b.add(30);
    System.out.println(b.getFreeSpace());
    b.add(20);
    System.out.println(b.getCurrentCapacity());

}
}