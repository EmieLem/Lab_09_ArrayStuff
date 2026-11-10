import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        int sum = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println();
        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);

        int userValue = SafeInput.getRangedInt(in, "Enter a value", 1, 100);
        int count = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue)
            {
                count++;
            }
        }

        System.out.println("The value " + userValue + " was found " + count + " times in the array.");
        int searchValue = SafeInput.getRangedInt(in, "Enter another value", 1, 100);

        int position = -1;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchValue)
            {
                position = i;
                break;
            }
        }

        if(position != -1)
        {
            System.out.println("The value " + searchValue +
                    " was found at array index " + position + ".");
        }
        else
        {
            System.out.println("The value " + searchValue +
                    " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("Average of data points is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}
