import java.util.Scanner;

public class Tarea8SistemaDeNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double notas5[] =new double[20];
        double notas4[] =new double[20];
        double notas1[] =new double[20];

        double notas[]=new double[20];

        for (int i=0;i<20;i++){

            try {
                System.out.println("Ingrese las notas del alumno por favor rango 1-7 : "+(i+1) );

                notas[i]=scanner.nextDouble();
                if(notas[i]>=7.1){


                    System.out.println("Nota mayor a 7,0 "+ notas[i]);
                    break;

                } else if (notas[i]<=0) {
                    System.out.println("Nota menor  a 1.0 "+ notas[i]);
                    break;
                }

            }catch (Exception e){

                System.out.println("Uso de punto o de letra error = "+ notas[i]);
                break;

            }


        }


        double suma1=0;

        double suma2=0;

        double suma3=0;
        double promedio=0;
        double promedio1=0;
        double promedio2=0;

        int contador1 =0;


        int contador2 =0;


        int contador3 =0;

        for (int i =0;i<20;i++){

            if (notas[i]>=5.0){
                contador1++;
                suma1=suma1+notas[i];
                promedio=promedio + suma1 / notas[i];
                notas5[i]=notas[i];

            }
            if (notas[i]<=4.0&& notas[i]>1.0){
                contador2++;

                suma2=suma2+notas[i];
                promedio1=promedio1 + suma1 / notas[i];
                notas4[i]=notas[i];


            }
            if (notas[i]>=1&& notas[i]<=2){

                contador3++;

                suma3=suma3+notas[i];
                promedio2=promedio2 + suma1 / notas[i];
                notas1[i]=notas[i];

            }





        }

      /*  for (int i =0;i<20;i++){
            System.out.println("Notas 5"+ notas5[i]+"\n");

            System.out.println("notas 4"+ notas4[i] +"\n");

            System.out.println("notas 1 "+ notas1[i] +"\n");
        }*/


        System.out.println(" Notas mayores a 5  tota = " + contador1 + " promedio de notas = "+promedio );

        System.out.println(" Notas menores  a 4 total= " + contador2+ " promedio de notas = "+promedio1 );
        System.out.println(" Notas iguales a 1 total = " + contador3 + " promedio de notas = "+promedio2 );





    double nota; // la nota a ingresar
    int contNotas1 = 0; // el contador de notas 1
    int contNotasMayoresA5 = 0; // contador de notas mayores a 5
    int contNotasMenoresA4 = 0; // contador de notas menores a 4
    double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
    double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
    double sumaTotal = 0; // suma total de notas

    double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

    boolean error = false;

        for (int i = 0; i < 20; i++) {
        System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
        nota =scanner .nextDouble();

        if (nota == 0) {
            error = true;
            break;
        }

        if (nota == 1) {
            contNotas1++;
        } else {
            if (nota > 5) {
                contNotasMayoresA5++;
                sumaNotasMayoresA5 += nota;
            } else if (nota < 4) {
                contNotasMenoresA4++;
                sumaNotasMenoresA4 += nota;
            }
        }
        sumaTotal += nota;
    }
        if (error) {
        System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
        System.exit(1);
    }
    // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
    //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
        System.out.println("No se puede calcular el promedio de notas sobre 5");
    } else {
        promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
        System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
    }

    // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
        System.out.println("No se puede calcular el promedio de notas bajo 4");
    } else {
        promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
        System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
    }

    // promedio total de las notas
    double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
}

}
