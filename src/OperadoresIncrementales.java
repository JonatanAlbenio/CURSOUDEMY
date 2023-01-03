public class OperadoresIncrementales {
    public static void main(String[] args) {

        
        //pre incremento
        int i=1;
        int j =++i;
        System.out.println("j = " + i);
        System.out.println("j = " + j);
        ///pos decremento
        i =2;
        j=i++;

        System.out.println("j = " + j);
        System.out.println("i = " + i);
        
        //pre decremento
        
        i =3;
        j=i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        
        //pos decremento
        
        i=5;
        j=--i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);



        System.out.println("(}}j) = " + (++j));
        System.out.println("(}}j) = " + (j++));

        System.out.println("(}}j) = " + (j));


    }
}
