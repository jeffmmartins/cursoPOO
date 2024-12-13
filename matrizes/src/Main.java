import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] mat = new int[n][n];

        for ( int i = 0; i< mat.length; i++){
            for (int j =0; j<mat[i].length; j++){
                mat[i][j]= sc.nextInt();
            }
        }

        System.out.println("Diagonal");
        for(int i= 0; i< mat.length ; i++){
            System.out.print(mat[i][i]);
        }
        int count = 0;
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n ; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}