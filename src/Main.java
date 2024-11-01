import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int[] dataPoints = new int[100];
        int UserInt = 0;
        int UserInt2 = 0;
        int Instance = 0;
        Boolean Found = false;
        UserInt = SafeInput.getRangedInt(in,"Please enter an integer between 1-100",1,100);
        UserInt2 = SafeInput.getRangedInt(in,"Please enter an integer between 1-100",1,100);
        int Total = 0;

        for(int i = 0; i < dataPoints.length; i++) {
                dataPoints[i] = new Random().nextInt(100) + 1;

        }
        for(int x = 0; x < dataPoints.length; x++) {
                System.out.printf("%d | ", dataPoints[x] );
        }
        for (int dataPoint : dataPoints) {
            Total = Total + dataPoint;

        }
        System.out.println();
        System.out.println("The sum of all the random numbers in dataPoints is " + Total);
        int Average = Total / dataPoints.length;
        System.out.println("The average of all the random numbers in dataPoints is " + Average);
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == UserInt) {
                    Instance = Instance + 1;
            }
        }
        System.out.println("You chose the number " + UserInt + " and it was found " + Instance + " time(s) inside dataPoints");
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == UserInt2) {
                    System.out.println("The integer " + UserInt2 + " was found at array index " + x);
                    Found = true;
                    break;
            }
        }
        if(!Found) {
                System.out.println("The value " + UserInt2 + " was not found in the array dataPoints");
        }
        int High = dataPoints[0];
        int Low = dataPoints[0];
        for(int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] > High){
                High = dataPoints[x];
            }
            else if (dataPoints[x] < Low){
                Low = dataPoints[x];
            }

        }
        System.out.println("The highest value in dataPoints is " + High + " and the lowest value in dataPoints is " + Low);
        System.out.println("Average of dataPoints is " + getAverage(dataPoints));


    }
    public static Double getAverage(int values[]){
        Double retDouble = 0.0;
        double Total = 0;
        for(int x = 0; x < values.length; x++){
            Total = Total + values[x];
        }
        retDouble = Total / values.length;

        return retDouble;
    }
}
