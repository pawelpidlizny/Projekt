public class Zadanie2 {
    public static void main(String[] args) {
        double liczba1 = 20;
        double liczba2 = 10;
        double liczba3 = 30;

        double srednia = obliczSrednia (liczba1,liczba2,liczba3);
        System.out.println("Średnia aretmetyczna : "+ srednia);
    }
    public static double obliczSrednia( double liczba1,double liczba2,double liczba3){
        return (liczba1+liczba2+liczba3)/3;
    }
}
