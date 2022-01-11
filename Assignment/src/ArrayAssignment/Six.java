package ArrayAssignment;

import java.util.Arrays;

public class Six {
public static void main(String[] args){
		
        int a[] = { 21, 57, 11, 37, 24 };
  
        int b[] = { 21, 57, 11, 37, 24 };

        boolean result = Arrays.equals(a, b);

        if (result == true) {
            
            System.out.println("Two arrays are equal");
        }
        else {
           
            System.out.println("Two arrays are not equal");
        }
    }
}
