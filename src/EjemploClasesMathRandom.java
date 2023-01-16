import java.util.Random;

public class EjemploClasesMathRandom {

    public static void main(String[] args) {


        String [] colores ={"azul","amarillo","negro","verde"};
        double random = Math.random();
        System.out.println("random = " + random);
        
        random *=colores.length;

        System.out.println("random = " + random);



        random=Math.floor(random);

        System.out.println("random = " + random);

        System.out.println("colores[random] = " + colores[(int) random]);


        Random randomObjet = new Random();

        int randomInt = 15+randomObjet.nextInt(25-15+1);

        System.out.println("randomInt = " + randomInt);


        randomInt=randomObjet.nextInt(colores.length);

        System.out.println("randomInt = " + randomInt);

        System.out.println("colores[randomInt] = " + colores[randomInt]);



    }


}
