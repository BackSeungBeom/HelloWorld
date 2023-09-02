import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World!!!");
        System.out.print("이름 입력: ");
        String name = in.next();
        System.out.printf("[%s]님 환영합니다~", name);
    }
}