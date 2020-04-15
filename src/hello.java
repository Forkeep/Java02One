import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name :");
        String name = scanner.nextLine();
        System.out.print("input age :");
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }

}
