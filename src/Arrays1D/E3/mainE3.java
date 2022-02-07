package Arrays1D.E3;

import java.util.Scanner;

public class mainE3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num = new int[10];
        for(int n=0;n<10; n++){
            num [n]=s.nextInt();
        }
        for (int i=9; i>0; i--){
            System.out.print(num[i]+" ");
        }
    }
}
