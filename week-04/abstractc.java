abstract class shape
{
    abstract double area();
}

class circle extends shape
{
    double radius;
    public circle(double radius)
    {
        this.radius = radius;
    }
    double area()
    {
        return Math.PI * radius * radius;
    }
}
class rectangle extends shape
{
    double length,breadth;
    public rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double area()
    {
        return length * breadth;
    }
}

class triangle extends shape
{
    double base,height;
    public triangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }

    double area()
    {
        return 0.5 * base * height;
    }
}

public class abstractc
{
    public static void main(String [] args)
    {
        shape circle = new circle(5);
        shape rectangle = new rectangle(4,5);
        shape triangle = new triangle(8,4);
        System.out.println("area of the circle is  " + circle.area());
        System.out.println("area of the rectangle is  " + rectangle.area());
        System.out.println("area of the triangle is  " + triangle.area());


        

    }
}