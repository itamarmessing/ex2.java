import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        }else if (exercise == 3) {
            f3();
        }else if (exercise == 4) {
            f4();
        }else if (exercise == 5) {
            f5();
        }else if (exercise == 6) {
            f6();
        }else if (exercise == 7) {
            f7();
        }else if (exercise == 8) {
            f8();
        }else if (exercise == 9) {
            f9();
        }else if (exercise == 10) {
            f10();
        }



    }

    public static void f1() {

        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        System.out.print("Last name initial: ");
        char initial = scanner.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Last name initial: " + initial);
        System.out.println("Age in 10 years: " + (age + 10));
    }

    public static void f2() {
        System.out.print("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = totalSeconds % 3600 / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
    public static void f3() {
        System.out.print("Bill: ");
        double bill = scanner.nextDouble();
        System.out.print("Tip percentage: ");
        double tipPercent = scanner.nextDouble();
        System.out.print("People: ");
        int people = scanner.nextInt();

        double tip = bill * tipPercent / 100;
        double total = bill + tip;
        double perPerson = total / people;

        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
        System.out.println("Per person: " + perPerson);
    }
    public static void f4() {
        System.out.print("Price of product 1: ");
        double price1 = scanner.nextDouble();
        System.out.print("Quantity of product 1: ");
        int quantity1 = scanner.nextInt();
        System.out.print("Price of product 2: ");
        double price2 = scanner.nextDouble();
        System.out.print("Quantity of product 2: ");
        int quantity2 = scanner.nextInt();
        System.out.print("Price of product 3: ");
        double price3 = scanner.nextDouble();
        System.out.print("Quantity of product 3: ");
        int quantity3 = scanner.nextInt();
        System.out.print("Discount precent: ");
        double discountPercent = scanner.nextDouble();

        double totalBefore = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double discount = totalBefore * discountPercent / 100;
        double finalPrice = totalBefore - discount;

        System.out.println("Total before discount: " + totalBefore);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + finalPrice);
    }
    public static void f5() {
        System.out.print("Distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Time in minutes: ");
        int minutes = scanner.nextInt();

        double hours = minutes / 60.0;
        double speed = distance / hours;

        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed: " + speed + "km/h");
        System.out.println("Distance in one hour: " + speed + "km");
    }
    public static void f6() {
        System.out.print("Assignments: ");
        int assignments = scanner.nextInt();
        System.out.print("Quiz: ");
        int quiz = scanner.nextInt();
        System.out.print("Final exam: ");
        int exam = scanner.nextInt();

        double finalGrade = (assignments * 0.2)+ (quiz * 0.3) + (exam * 0.5);

        System.out.println("Final grade: " + finalGrade);
        if (finalGrade >= 60) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
    public static void f7() {
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is bigger");
        } else {
            System.out.println("The numbers are equal");
        }

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }

        if (num2 % 5 == 0) {
            System.out.println(num2 + " is divisible by 5");
        } else {
            System.out.println(num2 + " is not divisible by 5");
        }

        int sum = num1 + num2;
        if (sum > 0) {
            System.out.println("The sum is positive");
        } else if (sum < 0) {
            System.out.println("The sum is negative");
        } else {
            System.out.println("The sum is zero");
        }
    }
    public static void f8() {
        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Error: invalid age");
        } else if (age < 12) {
            System.out.println("Ticket price: 25");
        } else if (age < 65) {
            System.out.println("Ticket price: 40");
        } else {
            System.out.println("Ticket price: 20");
        }
    }
    public static void f9() {
        System.out.print("Enter word: ");
        String word = scanner.next();

        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
    }
    public static void f10() {
         // 1: 3, 3.5
        // לחלק int בint מחזיר מספר שלם
        // כשמחלקים int בdouble התוצאה יוצאת double
        int a1 = 7;
        int b1 = 2;
        System.out.println(a1 / b1);
        System.out.println(a1 / 2.0);

        // 2: 2147483647 2147483648-.
        //  זה הדפיס  2147483648- מכיוון שאחרי שמוסיפים אחד למקסימום של הint זה הופך למינוס
        int num = 2147483647;
        System.out.println(num);
        System.out.println(num + 1);

        // 3: 0.3, false
        //  התוצאה שווה 0.3 בקירוב אך לא בדיוק לכן זה ידפיס 0.300000004 אבל זה יחזיר שקר כי זה לא שווה בדיוק
        double a2 = 0.1;
        double b2 = 0.2;
        System.out.println(a2 + b2);
        System.out.println(a2 + b2 == 0.3);

        // לא יודע מה זה יהיה4:
       // הדפיס  1.0E8  1.00000001E8
        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;
        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);
    }



}