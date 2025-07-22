public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Amr", 20, 3.5);
        Student student2 = new Student("Salma", 22, 3.9);
        student1.displayInfo();
        student1.study();

        student2.displayInfo();
        student2.study();
        student1.setGpa(3.8);
        student1.setAge(21);

        System.out.println("After update:");
        student1.displayInfo();
    }
}
