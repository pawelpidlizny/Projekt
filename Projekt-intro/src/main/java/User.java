public class User {
     String name;
     int age;
     public User(String name, int age) {
         this.name = name;
         this.age = age;
     }
     public String getName() {
         return name;
     }
     public int getAge() {
         return age;
     }
     public int averageAge() {
         return this.age;
     }
     public static void main(String[] args) {

         User dawid = new User("Dawid", 8);
         User amelia = new User("Amelia", 4);
         User irena = new User("Irena", 33);

         User[] users = {dawid, amelia, irena};
         for (int i = 0; i < users.length; i++) {
             System.out.println(users[i].getName());
         }
         int result = 0;

         for (int i = 0; i < users.length; i++) {
             result = result + users[i].getAge();
             System.out.println(users[i].averageAge());
         }
     }
 }
