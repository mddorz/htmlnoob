package src.zuoye;

import java.util.Scanner;

public class G3y21_2zuoye {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入month");

            int month = sc.nextInt();
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("春");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬");
                    break;
                default:
                    System.out.println("请重新输入");
            }

        }
    }
