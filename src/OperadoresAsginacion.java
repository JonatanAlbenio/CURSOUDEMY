public class OperadoresAsginacion {
    public static void main(String[] args) {

        int i=5;
        int j =i+4;
        i+=2;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i+=5;
        System.out.println("i = " + i);

        j-=4;
        System.out.println("j = " + j);

        j*=3;
        System.out.println("j = " + j);

        String sqlString ="select *from clientes as a ";
        sqlString+="where nombre like 'jonatan'";
        sqlString+="and c.activo=1";
        System.out.println("sqlString = " + sqlString);


    }
}
