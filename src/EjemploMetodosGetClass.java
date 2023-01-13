import java.lang.reflect.Method;

public class EjemploMetodosGetClass {
    public static void main(String[] args) {
        
        String txt ="hola que tal ";
        
       Class strClass= txt.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);
        

        for (Method method:strClass.getMethods()){

            System.out.println("method.getName() = " + method.getName());
        }


        Integer num =32;

        Class IntClass=num.getClass();
        System.out.println("IntClass.getName()  = " + IntClass.getName() );

        System.out.println("IntClass.getName()  = " + IntClass.getPackageName());

        System.out.println("IntClass.getName()  = " + IntClass.getSuperclass() );

        System.out.println("IntClass.getName()  = " + IntClass.getSuperclass().getSuperclass());







    }
}
