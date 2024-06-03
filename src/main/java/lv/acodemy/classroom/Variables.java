package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {
        // one line comment
        /*multi line comment
         * i can also write here */

        //Category: Integral

        //Byte:
        byte smallNumber = 120;

        //RGB
        byte red = 120;
        byte green = 45;
        byte blue = 127;
        System.out.println(blue);

        // int
        // Employee ID:
        int employeeId = 123456;

        // Population count:
        int populationOfLatvia = 1811956;
        System.out.println(populationOfLatvia);

        // short
        // Game Score:
        short playerScore = 15000;

        //yesr of birth:
        short yearOfBirth = 1990;

        //char
        //Grade:
        char grade = 'A';

        // Initials:
        char firstInitial = 'A';
        char lastInitial = 'Z';

        // Long
        // Bank Account Balance:
        long accountBalance = 100000000000L;
        long accountBalance2 = 1000000;

        // Java 7:
        // Improves readability
        long population = 1_000_000_000_000L;

        //Avoiding mistake
        int creditCardNumber = 1234_5678;

        //double
        // PI
        double piValue = Math.PI;
        System.out.println(Math.PI);

        // Another way
        double pi = 3.14_15_92;

        // Floating numbers:
        // float
        // Price
        float price = 1_234_567.89F;

        // Double
        //Finance Debt:
        double financeDebt = 23_456_789.45555;

        // Distance
        double distanceToSun = 149_549_870_3; // in km

        // Boolean (true/false)
        //has or is prefix:

        boolean isSummer = false;
        boolean hasSon = false;
        boolean hasBMW = true;

        // String (we can save here any text in double quotes)
        String firstName = "Anastasija";
        String lastName = "Zukova";

        // var
        var myCurrentAge = 25;
        var myFullName = firstName + " " + lastName;

        // Operators
        // * - multiplication
        // / - division
        // + - Addition
        // - - Subtraction
        // -- (-1)
        // ++ (+1)
        // % (the reminder after dividing a by b)

        boolean evenNumber = 4 % 2 == 0; //true
        boolean oddNumber = 4 % 3 == 0; //false

        int reminderResult = 5 % 3;
        System.out.println(reminderResult);

        int reminderResult2 = 10 % 4; //(10 / 4 = 8) (10-8=2)
        System.out.println(reminderResult2);


        // operators (simple example)
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println(result);
    }
}
