import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter 1st number:");
        a=sc.nextInt();
        System.out.println("enter 2nd number:");
        b=sc.nextInt();
        c=a+b;

        System.out.println(c);

    }
}