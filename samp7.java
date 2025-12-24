class samp7
{
    public static void main(String args[])
    {
        String s1 = new String("Java programming");

        String s2 = s1.toUpperCase();
        String s3 = s1.trim();
        String s4 = s1.replace("a", "_");
        String s5 = s1.substring(5);

        System.out.println("s1=" + s1);
        System.out.println("uppercase=" + s2);
        System.out.println("trim=" + s3);
        System.out.println("replace=" + s4);
        System.out.println("substring=" + s5);
        System.out.println("index=" + s1.indexOf('a'));

        StringBuffer sb1 = new StringBuffer("java language");
        StringBuffer sb2 = new StringBuffer(" is interesting");
        StringBuffer sb5 = new StringBuffer("C++ language");
        StringBuffer sb6 = new StringBuffer(" is interesting");

        StringBuffer sb3 = sb1.append(sb2);
        StringBuffer sb4 = sb5.insert(4, sb6);

        System.out.println("After appending=" + sb3);
        System.out.println("After inserting=" + sb4);
    }
}
