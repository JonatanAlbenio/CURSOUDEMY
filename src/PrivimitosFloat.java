import java.util.Arrays;

public class PrivimitosFloat {
    public static void main(String[] args) {
        float realFloat =23.2F;
        System.out.println("Float"+ realFloat);
        System.out.println("Float corresponde en byte a  = " + Float.BYTES );
        System.out.println("Float corresponde en bite a   = " +Float.SIZE);
        System.out.println("maximo corresponde en byte a  = " +Float.MAX_VALUE );
        System.out.println("minimo corresponde en byte a  = " +Float.MIN_VALUE );

        double realdoble= 3.4028235E39;
        System.out.println("double"+ realdoble);
        System.out.println("double corresponde en byte a  = " + Double.BYTES );
        System.out.println("double corresponde en bite a   = " +Double.SIZE);
        System.out.println("maximo corresponde en byte a  = " +Double.MAX_VALUE );
        System.out.println("minimo corresponde en byte a  = " +Double.MIN_VALUE );
        
        var varFlotante =3.1234d;
        System.out.println("varFlotante = " + varFlotante);
    }
}

