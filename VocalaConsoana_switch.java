public class VocalaConsoana_switch{
    public static void main(String[] args){
        char litera='b';

        switch(litera){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Litera "+litera+" este o vocala");
            break;
                  default:
                      System.out.println("Litera "+litera+" este o consoana");
        }

    }
}
    
