package src.zuoye;

import java.sql.SQLOutput;
import java.util.Scanner;

public class G3y21_1zuoye {
    public static void main(String[] args) {
        System.out.println("开始：");
        Scanner xm=new Scanner(System.in);
        System.out.println("小明考了多少分;");
        int xiaoming=xm.nextInt();
        if (xiaoming<10) {
            System.out.println("跪玻璃渣");
        }else if (10<=xiaoming&&xiaoming<60){
            System.out.println("七匹狼伺候");
        }else if (60<=xiaoming&&xiaoming<80){
            System.out.println("不能吃饭");
        }else if (80<=xiaoming&&xiaoming<100){
            System.out.println("奖励两块钱");
        }
        System.out.println("结束");
    }
}
