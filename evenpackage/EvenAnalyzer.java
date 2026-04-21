package evenpackage;

public class EvenAnalyzer {
    public static void evennumbers(int[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                System.out.print("\nEven Numbers: " + arr[i] + " ");

            }
        }
        System.out.print("\nEven Total Values: " + totalValues(arr));
        System.out.println();
    } static int totalValues(int[] arr){
        int count =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    
}
