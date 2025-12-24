import java.io.*;

class wrap
{
    public static void main(String args[])
    {
        float principle_amt = 0;
        float interest_rate = 0;
        int numyrs = 0;

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter principle amount");
            principle_amt = Float.parseFloat(br.readLine());

            System.out.println("Enter interest rate");
            interest_rate = Float.parseFloat(br.readLine());

            System.out.println("enter the number of years");
            numyrs = Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Input error");
        }

        double a = principle_amt * interest_rate * numyrs / 100;
        System.out.println("Simple interest=" + a);
    }
}
