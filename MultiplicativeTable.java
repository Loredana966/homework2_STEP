import java.util.Scanner;

public class MultiplicativeTable{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar intreg: ");
        int n=scanner.nextInt();
        System.out.println();

        System.out.println("Tabelul multiplicarii lui "+n+" :");
        System.out.println();

        int i=0;
        while(i<=10){
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }
        scanner.close();
    


    }
}