package Arrays1D.E4;

public class mainE4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for(int n=0;n<20; n++){
            numero [n]=(int)(Math.random()*101);
        }
        for(int n=0;n<20; n++){
            cuadrado [n]=(int)Math.pow(numero[n], 2);
        }
        for(int n=0;n<20; n++){
            cubo [n]=(int)(Math.pow(numero[n], 3));
        }
        System.out.println("  n  │   n2  │   n3"+System.lineSeparator()+"─────┼───────┼─────────");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%4d │ %5d │%8d"+System.lineSeparator(), numero[i], cuadrado[i], cubo[i]);
        }
    }
}
