class calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }

}

class advcalculator extends calculator
{
    public int mult(int a, int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
public class sinheritence
{
    public static void main(String[] args)
    {
        advcalculator calc = new advcalculator();
        int r1 = calc.add(2,5);
        int r2 = calc.sub(8,1);
        int r3 = calc.mult(5,8);
        int r4 = calc.div(9,3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}