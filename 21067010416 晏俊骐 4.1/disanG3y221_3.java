package src.Hjava;

import java.util.Scanner;

public class disanG3y221_3 {
    public static void main(String[] args) {
        Scanner xyy=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=xyy.nextInt();
        if(a%2==0){
            System.out.println(a+"是偶数");
        }else{
            System.out.println(a+"是奇数");
        }

    }
}
