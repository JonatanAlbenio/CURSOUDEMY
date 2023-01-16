import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistemas {


    public static void main(String[] args) {


        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());

            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","mi valor xd ");

            System.setProperties(p);


            System.getProperties().list(System.out);
            Properties ps =System.getProperties();

            System.out.println("ps.getProperty(\"config.autor\") = " + ps.getProperty("config.puerto.servidor"));
            System.out.println("System.getProperties(\"\") = " + System.getProperty("config.autor.nombre"));

            ps.list(System.out);



        } catch (FileNotFoundException e) {
            System.err.println("No existe el archivo "+e);
            System.exit(1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
