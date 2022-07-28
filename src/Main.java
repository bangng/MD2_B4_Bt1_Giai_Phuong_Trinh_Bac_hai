import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        while (a == 0){
            System.out.println("Return enter a");
            a = scanner.nextDouble();
        }
        quadraticEquation.setA(a);

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        quadraticEquation.setB(b);
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        quadraticEquation.setC(c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0){
            System.out.println("Phương trình vô nghiệm:");
        }else if (delta == 0){
            System.out.println("Phương trình có nghiệm kép: ");

            System.out.println("x =" +quadraticEquation.getRoot());
        }else {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1 =" +quadraticEquation.getRoot1());
            System.out.println("x2 =" +quadraticEquation.getRoot2());
        }
    }
}
