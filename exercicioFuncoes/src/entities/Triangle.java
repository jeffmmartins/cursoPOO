package entities;

public class Triangle {
    public int a;
    public int b;
    public int c;

    public double area(){
        int  p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
