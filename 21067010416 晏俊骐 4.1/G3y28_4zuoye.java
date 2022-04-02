package src.zuoye;

import java.util.Scanner;

public class G3y28_4zuoye {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入排");
            int n = sc.nextInt();
            Scanner vs = new Scanner(System.in);
            System.out.println("请输入列");
            int t = vs.nextInt();
            int a = 1;

            for(int p=1;p<=n;p++)
            {
                for (int l= 1; l <= 8; l++) {
                    System.out.println("第" + p + "排" + ",第" + l + "列:" + a);
                    a++;
                    if(n==p&&l==t-1){
                        break;}

                }
            }
        }
        }


