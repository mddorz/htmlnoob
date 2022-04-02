package src.zuoye;

import java.util.Scanner;

public class G3y28_1zuoye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n");
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.println("须输入大于1的自然数！");
        } else {
            int b, c, d;
            for (b = 1; b <= a; b++) {
                for (d = 1; d <= a - b; d++) {
                    System.out.print(" ");
                }
                for (c = 1; c <= 2 * b - 1; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
