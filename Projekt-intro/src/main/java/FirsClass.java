public class FirsClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600,1500,2018);
        System.out.println(notebook.weight + "  " +  notebook.price + "  " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000,1000,2017);
        System.out.println(heavyNotebook.weight+ "  " + heavyNotebook.price + "  " + heavyNotebook.year );
        heavyNotebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1600,500,2000);
        System.out.println(oldNotebook.weight + "  " + oldNotebook.price + "  " + oldNotebook.year);
        oldNotebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}