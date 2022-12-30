public class PrimitivosCarateres {
    public static void main(String[] args) {

        char caracter ='\u0040';
        System.out.println("caracter = " + caracter);
        char decimal =64;
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal== caracter) = " + (decimal== caracter));
        char simbolo ='@';
        char espacio ='\u0020';
        char retroceso ='\b';
        char tabular ='\t';
        char saltoLinea='\n';
        char retornoCarro='\r';
        System.out.println("simbolo  = " + System.getProperty("linea.separator")+ simbolo );
        System.out.println("simbolo  = " + (simbolo ==caracter) );
        System.out.println("char corresponde en byte = " +espacio + Character.BYTES);
        System.out.println("char corresponde en bite = " +retroceso+ Character.SIZE);
        System.out.println("CHARATER.MIN_VALUE = "+tabular + Character.MIN_VALUE);
        System.out.println("CHARATER.MAX_vALUE = "+saltoLinea + Character.MAX_VALUE);




    }
}
