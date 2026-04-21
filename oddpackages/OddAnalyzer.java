package oddpackages;

public class OddAnalyzer { 
    public static void oddnumbers(int[] arr){
        
        for(int i = 0; i<arr.length;i++){
            if(arr[i] % 2 != 0){
            System.out.print("\nOdd Numbers: " + arr[i] + " ");
        }
    }
    System.out.print("\n Odd Total Values: " + totalValues(arr));
    System.out.println();

    } static int totalValues(int[] arr){
        int count=0;
        for(int i  = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
    
}
