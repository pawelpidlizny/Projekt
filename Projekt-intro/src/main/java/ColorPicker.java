import java.util.Scanner;
public class ColorPicker {

    public static String getColorName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza litere A/B/C:");
        System.out.println("Podaj inna litere ktora bedzie pokazywała nieznany kolor");
        char colorLetter  = scanner.nextLine().toUpperCase().charAt(0);
        String colorName;

        switch (colorLetter){
            case 'A': colorName = "Niebieski";
            break;
            case 'B': colorName = "Żółty ";
            break;
            case 'C': colorName = "Czerwony";
            break;
            default: colorName = "Nieznany kolor";
            break;
        }
        return colorName;
    }
    public static void main(String[] args) {
        String pickedColor = getColorName();
        System.out.println("Wybrany kolor:" + pickedColor);
    }
}
