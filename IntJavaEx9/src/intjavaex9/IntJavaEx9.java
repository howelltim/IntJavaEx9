
package intjavaex9;

import java.util.Scanner;

public class IntJavaEx9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        arraysWork();
    }
    static void p(String msg){
        System.out.println(msg);
    }
    static void arraysWork(){
        p("Working with arrays");
        
        //declare an array of a specific size
        int[] exArray = new int[10];
        
        //declare on one line
        int[] exArray2 = {1, 2, 3, 4, 5};
        
        //declare seperately
        int[] exArray3;
        exArray3 = new int[2];
        
        //2D array
        int[][] exArray4 = new int[3][3];
        
        //2D one line
        int[][] exArray5 = {{1,2}, {3,4}, {5,6}, {7,8}};
        
        //3D array (D:)
        int[][][] exArray6 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        
        p("Array size: " + exArray.length);
        p("Array size: " + exArray2.length);
    }
}
