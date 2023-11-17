package resources;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList=new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grape");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Orange");
        fruitList.add("Strawberry");
        fruitList.add("Cherry");

        Iterator<String> iterator=fruitList.iterator();
    while (iterator.hasNext()){
        System.out.print(iterator.next()+",");
    }
    }
}
