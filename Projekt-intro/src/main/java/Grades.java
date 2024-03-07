public class Grades {
    private int[] grades;
    private int size;
    public  void  add (int value){
        if (this.size==10){
        }
        this.grades[this.size]=value;
        this.size++;
    }
}