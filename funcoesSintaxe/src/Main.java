import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int higher = max(x,y,z);
        showResult(higher);

        sc.close();
    }
    public static int max(int a, int b, int c){
        int aux;
        if (a > b && a > c){
            aux = a;
        } else if (b > c) {
            aux = b;
        }else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
    
}