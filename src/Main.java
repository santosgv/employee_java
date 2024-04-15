import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();

        System.out.print("Name: ");
        em.name = sc.nextLine();
        System.out.print("Gross salary: ");
        em.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        em.tex = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + em);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        em.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + em);



        sc.close();
    }
}