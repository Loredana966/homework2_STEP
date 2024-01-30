public class SumPrimeleNnum_doWhile{
    public static void main(String[] args){
        int n = 6;
        int suma = 0;
        int i = 1;

        do{
            suma+=i;
            i++;
        }while(i<=n);

        System.out.println("Suma primelor "+n+" numere este: "+suma);
    }
}