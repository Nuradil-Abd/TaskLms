import java.util.Arrays;

public class MyClass {

    String name, surname,favoriteFood;
    int age;
    String[] lessons;


    public MyClass() {
    }

    public MyClass(String name, String surname, String favoriteFood, int age, String[] lessons) {
        this.name = name;
        this.surname = surname;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.lessons = lessons;
    }

    public MyClass(String surname, int age, String favoriteFood ) {
        this.surname = surname;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public String getLessons(){
       return Arrays.toString(lessons);
    }

    public String getInfo(){
        return String.format("Name: %s\n" +
                             "Surname: %s\n" +
                             "Age: %d\n" +
                             "Lessons: %s\n" +
                             "Favorite food: %s\n",name, surname,age,getLessons(),favoriteFood);
    }
}
