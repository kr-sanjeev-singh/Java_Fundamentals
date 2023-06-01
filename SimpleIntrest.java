import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        int simpleIntrest = ((principal * rate * time) / 100);
        System.out.println("Simple intrest is " + simpleIntrest);
    }
}
