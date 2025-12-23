class area
{ 
    void area1(int a, int b)
    { 
        int c = a * b;
        System.out.println("c=" + c);
    } 

    void area1(int d)
    { 
        int e = d * d;
        System.out.println("e=" + e);
    } 

    void area1(double a, double b)
    {
        double c = a + b;
        System.out.println("c=" + c);
    } 

    double area1(double x, double y, double z)
    {
        double xyz;
        xyz = x * y * z;
        return xyz;
    }
}

class prgm4
{ 
    public static void main(String args[])
    {
        area a1 = new area();

        a1.area1(10, 20);
        a1.area1(25);
        a1.area1(5.0, 5.0);

        double newxyz = a1.area1(1.5, 2.5, 3.5);
        System.out.println("double val areal is=" + newxyz);
    }
}
