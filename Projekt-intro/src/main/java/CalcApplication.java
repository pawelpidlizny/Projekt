public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double area = calculator.circleArea(10);
        System.out.println("Pole koła o promieniu 10 wynosi: + area");

        double p = Calculator.PI;
        System.out.println("Wartość stałej π wynosi: obliczona wartość π");

        Calculator calculator2 = new Calculator();
        System.out.println(Calculator.counter);
    }
}
