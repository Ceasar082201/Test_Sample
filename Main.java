import java.util.Scanner;
public class Main {
public static void main(String[]Args){
    String fname,mname,lname;

    int age,address;

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Given name: ");
        fname = sc.nextLine();

        System.out.println("Middle name: ");
        mname = sc.nextLine();

        System.out.println("Surname: ");
        lname = sc.nextLine();

        System.out.println("How old are you: ");
        age = sc.nextInt();

        System.out.println("Where do you live: ");
        address = sc.nextInt();
    }

    System.out.println("My name is " + fname + mname + lname);
    System.out.println("I am " + age + " years old \n I live in " + address);
 }
}
