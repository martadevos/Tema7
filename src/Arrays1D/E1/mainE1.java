package Arrays1D.E1;

public class mainE1 {
    public static void main(String[] args) {
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[8] = 5;
        num[9] = 120;
        for(int n:num){
            System.out.print(n+" ");
        }
        //Los valores de los elementos que no han sido inicializados salen a 0 automaticamente
    }
}
