public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap, Ten notebook jest tani.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good, Cena jest good.");
        } else if (this.price > 1100) {
            System.out.println("This notebook is  expensive, Ten notebook jest drogi.");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is light,Ten notebook jest lekki.");
        } else if (this.weight <= 1600) {
            System.out.println("This notebook is heavy, Ten notebook jest ciężki");
        } else if (this.weight > 1700) {
            System.out.println("This notebook is not very heavy,Ten notebook jest bardzo ciężki");
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2015 && this.price >= 600 && this.price <= 1000) {
            System.out.println("This computer is old and at moderate price");
        } else if (this.year > 2015 && this.price >= 600 && this.price <= 1000) {
            System.out.println("This computer is new and at moderate price");
        } else if (this.year < 2015 && this.price < 600) {
            System.out.println("This computer is old and cheap");
        } else if (this.year > 2015 && this.price < 600) {
            System.out.println("This computer is new and cheap");
        }
        if (this.year > 2015 && this.price > 1000) {
            System.out.println("This computer is new and expensive");
        }
    }
}