public class EjemplosStringInmutable {
    public static void main(String[] args) {

       String curso ="Programacion Java";
       String profesor ="Jonatan Medina";

      String resultado= curso.concat(profesor);

      System.out.println("curso = " + curso);


      System.out.println("curso = " + resultado);

      System.out.println(curso==resultado);
        
      String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);

    


    }
}
