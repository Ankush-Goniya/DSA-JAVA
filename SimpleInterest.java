package input;


    import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of principle");
        float p = sc.nextFloat();

        System.out.println("Enter  the rate of interest");
        float r = sc.nextFloat();

        System.out.println("Enter the time");
        float t = sc.nextFloat();

        float si = (p * r * t)/100;

        System.out.println("Principle: " + p);
        System.out.println("Rate: " + r);
        System.out.println("Time: " + t);

        System.out.println("Simple Interest is: " + si);
    }
}


