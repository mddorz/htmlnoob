package src.zuoye;

public class G3y23_5zuoye {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D=0;
        for (int E=101;E<=999;E+=1){
            A=E/100;
            B=(E%100)/10;
            C=(E%100)%10;
            D=A*A*A+B*B*B+C*C*C;
            if (D==E){
                System.out.println(E);
            }
        }
    }
}
