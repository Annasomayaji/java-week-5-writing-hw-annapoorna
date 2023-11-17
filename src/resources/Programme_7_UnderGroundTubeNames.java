package resources;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_UnderGroundTubeNames {
public void isEmpty() {
    ArrayList<String> tubeNames = new ArrayList<>();
    tubeNames.add("Bakerloo_line");
    tubeNames.add("Central_line");
    tubeNames.add("Circle_line");
    tubeNames.add("District_line");
    tubeNames.add("Hammersmith_and_City_line");
    tubeNames.add("Jubilee_line");
    tubeNames.add("Metropolitan_line");
    tubeNames.add("Northen_line");
    tubeNames.add("Piccadilly_line");
    System.out.println("Given Array List: " + tubeNames);
    if (tubeNames.isEmpty()) {
        System.out.println("Given array List is empty!");
    } else {
        System.out.println("Given Array List is not empty!");
    }
}
public static void main(String[] args){
Programme_7_UnderGroundTubeNames obj=new Programme_7_UnderGroundTubeNames();
obj.isEmpty();
}
}
