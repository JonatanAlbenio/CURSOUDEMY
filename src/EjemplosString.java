public class EjemplosString {
    public static void main(String[] args) {
        
        String curso="programación java";
        
        String curso2=new String("Programación jAva");
        
        boolean esIgual = curso==curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual=curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
        
        
        String curso3="programación java";
        
        esIgual=curso==curso3;

        System.out.println("esIgual = " + esIgual);
        






    }
}
