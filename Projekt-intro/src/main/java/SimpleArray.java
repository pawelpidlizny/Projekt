public class SimpleArray {
    public static void main(String[] args) {
        String [] movies =  new String[5];
        movies [0] = "Dog";
        movies [1] = "Cet";
        movies [2] = "Harry Poter ";
        movies [3] = "Wołodzijowski";
        movies [4] = "W Pustyni i Puszczy";

        String movie = movies [4];
        int numberOfElements = movie.length();
        System.out.println(" Moja tablica zawiera [5] elementów");
    }
}
