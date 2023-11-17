package resources;

import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Red");
        colorlist.add("Blue");
        colorlist.add("Green");
        colorlist.add("Yellow");
        colorlist.add("Black");
        colorlist.add("Purple");
        colorlist.add("Orange");
        colorlist.add("Cyan");

        for(String color: colorlist){
            System.out.print(color + ", ");
        }
    }
}
