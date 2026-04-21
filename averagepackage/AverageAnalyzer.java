package averagepackage;

public class AverageAnalyzer {
    public static void averagenumbers(int[] arr){
        
    int sum=0;
        for(int i= 0;i< arr.length;i++){
            sum += arr[i];
        }
         double average = (double) sum/arr.length;
         System.out.print("\n AVERAGE: " + average);

    } static void aboveAverage(int average, int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(average < arr[i]){
                System.out.print("\n ABOVE AVERAGE: " + arr[i]);
                count++;
            }
        }
        System.out.print(count);
    }
}
