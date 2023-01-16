import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {


        Runtime rt = Runtime.getRuntime();

        Process process;

        if(System.getProperty("os.name").startsWith("Windows")){
            try {
                process=rt.exec("notepad");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                process=rt.exec("gedit");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Se ha cerrado el editor |" );
        System.exit(0);

    }
}
