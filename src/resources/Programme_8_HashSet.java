package resources;

import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_HashSet {
    public static void main(String[] args) {
        //create a hashset object called numbers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //SHow which numbers between 1 and 10 are in the set
        for (int i = 0; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is found in the set.");
            }else{
                System.out.println(i+ " is not found in the set.");
            }
        }
    }
}
