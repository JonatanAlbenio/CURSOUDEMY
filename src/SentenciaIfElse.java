public class SentenciaIfElse {
    public static void main(String[] args) {

    float promedio =3.7f;


        if (promedio >=6.5){
            System.out.println("Felicitaciones, excelente promedio " );
        }
        else if (promedio>=6.0){
            System.out.println(" Mala nota joven ");
        } else if (promedio>=5.5) {
            System.out.println(" Buen promedio " );
        } else if (promedio>=5.0) {
            System.out.println(" regular perrito" );
        } else if (promedio>=4.0) {
            System.out.println(" insuficiente " );
        }else {
            System.out.println(" REPROBADO" );
        }

        System.out.println("promedio es  = " + promedio);


    }
}
