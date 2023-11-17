package resources;

import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseArray {
   public static void main(String[] args){
       int[] array= new int[] {23,45,34,54,67,78};
       //Single dimension array
       System.out.println("Original array: "+ Arrays.toString(array));
       Programme_3_ReverseArray obj=new Programme_3_ReverseArray();
       System.out.println("Reverse array: ");
       obj.reverseArray(array);
   }

   //method to reverse the array
    public void reverseArray(int[] array){
       for(int i=0;i<(array.length)/2; i++){
          int temp = array[i];
          array[i]=array.length-1-i;
          array[array.length-1-i]=temp;
       }
        System.out.println(Arrays.toString(array));
    }
}
