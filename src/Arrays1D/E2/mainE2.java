package Arrays1D.E2;

public class mainE2 {
    public static void main(String[] args) {
        char[] caracter=new char[10];
        caracter[0]='a';
        caracter[1]='x';
        caracter[4]='@';
        caracter[6]=' ';
        caracter[7]='+';
        caracter[8]='Q';
        for(char c:caracter){
            System.out.print(c+" ");
        }
        //En los valores de los elementos que no han sido inicializados sale icono de caracter no existente
    }
}
