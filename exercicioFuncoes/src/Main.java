import java.util.Scanner;
import entities.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle x");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();
        System.out.println("Enter the measures of triangle y");
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();

        int triangle1 = triangulo1(x.a,x.b,x.c);
        int triangle2 = triangulo2(y.a,y.b,y.c);

        System.out.println("Triangle x area: " + triangle1);
        System.out.println("Triangle x area: " + triangle2);
        showResult(triangle1,triangle2);
        sc.close();
    }

    public static int triangulo1 (int a, int b, int c){
        int resultTriangle1= (a+b+c)/2;
        return resultTriangle1;
    }

    public static int triangulo2 (int d, int e, int f){
        int resultTriangle2= (d+e+f)/2;
        return resultTriangle2;
    }

    public static void showResult(int a, int b){
        if (a>b){
            System.out.println("Triangle x is higher");
        }else{
            System.out.println("Triangle y is higher");
        }
    }
}