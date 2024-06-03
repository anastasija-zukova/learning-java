package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Anastasija";
        String surname = "Zukova";

        //concatenation
        String myText = "My name is " + name + " " + surname;
        System.out.println(myText);

        System.out.println("My name is " + name + " " + surname);

        //interpolation
        // %s - for text
        // %d - for numeric values

        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(interpolation);


        // exercise
        String firstName = "John";
        String lastName = "Doe";
        int age = 25;
        String city = "New York";
        System.out.println(firstName + " " + lastName + " ");

        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));


    }
}
