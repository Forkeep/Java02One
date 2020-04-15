import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        // .equals()判断引用类型变量内容是否相等
        // == 判断值类型变量内偶然那个是否相等  或者  引用类型的引用地址是否相等
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }

    }

}
