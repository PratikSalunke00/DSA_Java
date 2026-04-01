// **** To print Hollow_Rectangle ****
/*
import java.util.*;
public class pattern2 {
    public static void hollow_rect( int totRows, int totCols) {
        for(int i=1; i<= totRows; i++) {
            for(int j=1; j<= totCols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        hollow_rect(10,7);
    }
}
*/


// **** To print Inverted & Rotated Half-Pyramid ****
/*
import java.util.*;
public class pattern2 {
    public static void inverted_rotated_half_pyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<= n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main (String args[]){
        inverted_rotated_half_pyramid(8);
    }
}
*/