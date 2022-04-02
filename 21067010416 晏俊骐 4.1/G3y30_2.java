package src.Demo;

import java.util.Random;

public class G3y30_2 {
    public static void main(String[] args) {
        Random r=new Random();

        for (int i=0;i<10;i++){
            int number=r.nextInt(10);
            System.out.println("number:"+number);
        }

        int x=r.nextInt(100)+1;
        System.out.println(x);
    }
}
