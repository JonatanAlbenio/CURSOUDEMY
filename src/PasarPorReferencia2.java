class Personas{

    private String nombre;

    public void modificarNombre (String newnombre){

        this.nombre=newnombre;

    }
    public String leerNombre(){

        return this.nombre;
    }


}
public class PasarPorReferencia2 {
    public static void main(String[] args) {



        Personas personas = new Personas();

        personas.modificarNombre("andres");


        System.out.println("personas = " + personas.leerNombre());

        test(personas);
        System.out.println("personas =  = " + personas.leerNombre());




    }
    public static void test(Personas personas){
        personas.modificarNombre("juan");


    }
}
