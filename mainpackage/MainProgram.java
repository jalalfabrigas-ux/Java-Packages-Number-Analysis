package mainpackage;
import java.util.*;
 public class MainProgram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size =sc.nextInt();

        int[] arr =new int [size];

        for(int i=0 ;i<arr.length;i++){
            System.out.print("Number Stored [" + (i+1) + "]: ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        evenpackage.EvenAnalyzer.evennumbers(arr);
        oddpackages.OddAnalyzer.oddnumbers(arr);
        averagepackage.AverageAnalyzer.averagenumbers(arr);
        
        
    }
 }
