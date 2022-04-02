package src.zuoye;

import java.util.Random;
import java.util.Scanner;

public class G3y30_2zuoye {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个1到100之间的数：");
        Random b = new Random();
        int y = b.nextInt(100) + 1;
        for (int i = 0; i < 100; i++) {
            int x = a.nextInt();
            if (x < y) {
                System.out.println("你猜的数小了");
                continue;
            }
            if (x > y) {
                System.out.println("你猜的数大了");
                continue;
            } else {
                System.out.println("你猜对了！");
                break;
            }
        }
    }
}
