public class EjemplosStringConcatenacion {
    public static void main(String[] args) {

       String curso ="Programacion Java";
       String profesor ="Jonatan Medina";

       String detalle = curso+ "con el profesor " + profesor;

        System.out.println("detalle = " + detalle +"\n");


        int numeroA = 10;
        int numeroB =5;

        System.out.println(detalle+ ( numeroB+numeroA));


        System.out.println(numeroB+numeroA +detalle);



        String detalle2=curso.concat(" Con " .concat(profesor));

        System.out.println("detalle2 = " + detalle2);






    }
}
