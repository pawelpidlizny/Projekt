import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Podaj rok ");
        int rok = scanner.nextInt();

        if (czyPrzystepny (rok)) {
            System.out.println(rok +   " to rok przestępny");
        }else {
            System.out.println(rok +   " to rok nie przestepny");
        }
    }
    static boolean czyPrzystepny( int rok ){
        return (rok % 4 == 0 && rok % 100!=0 ) || ( rok % 400 == 0 );
    }
}