import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int g = scanner.nextInt();
        String result = (g >= 40) ? "Pass" : "Fail";
        System.out.println("Result"+result);
    }
}