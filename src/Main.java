public class Main {
    public static void main(String[] args) {
        String[] lessons = {"Java", "English","Soft skills","Flutter"};

        MyClass student = new MyClass("Nuradil","Abdynazarov","Lanzhou lam'en", 27, lessons);
        MyClass student1 = new MyClass("Abdynazarov",27, "Lanzhou lam'en");


        System.out.println(student.getInfo());
        System.out.println(student1.getInfo());
    }
}