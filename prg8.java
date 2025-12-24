import java.io.*;
import java.util.*;
import java.lang.*;

class prg8
{
    public static void main(String n[])
    {
        Vector<String> v = new Vector<>();
        int i, len, s;

        len = n.length;

        for (i = 0; i < len; i++)
        {
            v.addElement(n[i]);
        }

        s = v.size();
        System.out.println("size=" + s);

        String x[] = new String[s];
        v.copyInto(x);

        System.out.println("elements are copied into string array x are");
        for (i = 0; i <= s - 1; i++)
        {
            System.out.println(x[i]);
        }

        v.insertElementAt("PQR", 3);
        s = v.size();
        System.out.println("after inserting the size of the vector is:" + s);
    }
}