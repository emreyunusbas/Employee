public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("kemal", 2000.0, 45, 1985);
        Employee e2 = new Employee("ahmet", 3500.0, 45, 1970);

        System.out.println("Çalışan 1:");
        System.out.println(e1.toString());

        System.out.println("\nÇalışan 2:");
        System.out.println(e2.toString());


    }
}
