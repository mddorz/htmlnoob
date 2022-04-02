package src.zuoye;

import java.util.Scanner;

public class G3y23_6zuoye {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n");
        int n = sc.nextInt();
        switch (n){
            case 1:
            case 2:
                System.out.println(1);
                break;
            default:


                int q=1;
                int h=1;
                int all=0;
                for(int x=0; x<=n-3;x++)
                {
                    all=q+h;
                    q=h;
                    h=all;

                }        System.out.println(all);
        }
    }
}