import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle x");
        int ladoA = sc.nextInt();
        int ladoB = sc.nextInt();
        int ladoC = sc.nextInt();
        System.out.println("Enter the measures of triangle y");
        int ladoD = sc.nextInt();
        int ladoE = sc.nextInt();
        int ladoF = sc.nextInt();

        int triangle1 = triangulo1(ladoA,ladoB,ladoC);
        int triangle2 = triangulo2(ladoD,ladoE,ladoF);

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