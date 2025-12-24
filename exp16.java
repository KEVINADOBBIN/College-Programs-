class A extends Exception
{
    A(String message)
    {
        super(message);
    }
}

class exp16
{
    public static void main(String args[])
    {
        int y = 0, x = 5, z = 5, al;

        try
        {
            try
            {
                al = (y / x - z);
                System.out.println("the value is=" + al);
            }
            catch (ArithmeticException q)
            {
                System.out.println("inside second exception");
            }

            if ((x - z) == 0)
            {
                throw new A("inside try");
            }
        }
        catch (A e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("inside final");
        }
    }
}
