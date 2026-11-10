import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int val;

        while(true)
        {
            System.out.print(prompt + ": ");

            if(pipe.hasNextInt())
            {
                val = pipe.nextInt();
                pipe.nextLine();
                return val;
            }
            else
            {
                System.out.println("Invalid integer.");
                pipe.nextLine();
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double val;

        while(true)
        {
            System.out.print(prompt + ": ");

            if(pipe.hasNextDouble())
            {
                val = pipe.nextDouble();
                pipe.nextLine();
                return val;
            }
            else
            {
                System.out.println("Invalid double.");
                pipe.nextLine();
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int val;

        while(true)
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextInt())
            {
                val = pipe.nextInt();
                pipe.nextLine();

                if(val >= low && val <= high)
                {
                    return val;
                }

                System.out.println("Value must be between " + low + " and " + high + ".");
            }
            else
            {
                System.out.println("Invalid integer.");
                pipe.nextLine();
            }
        }
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double val;

        while(true)
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextDouble())
            {
                val = pipe.nextDouble();
                pipe.nextLine();

                if(val >= low && val <= high)
                {
                    return val;
                }

                System.out.println("Value must be between " + low + " and " + high + ".");
            }
            else
            {
                System.out.println("Invalid double.");
                pipe.nextLine();
            }
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String input;

        while(true)
        {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine();

            if(input.equalsIgnoreCase("Y"))
            {
                return true;
            }

            if(input.equalsIgnoreCase("N"))
            {
                return false;
            }

            System.out.println("Please enter Y or N.");
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String input;

        while(true)
        {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();

            if(input.matches(regEx))
            {
                return input;
            }

            System.out.println("Invalid input.");
        }
    }
}
