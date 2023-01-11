public class PrecedenciaOperadores {

    public static void main(String[] args) {

        int j =12;
        int i =8;
        int k =20;

        double promedio = (i+j+k)/3d;

        System.out.println("promedio = " + promedio);

        promedio = i+j+k/3d*10;

        System.out.println("promedio = " + promedio);



    }
}
