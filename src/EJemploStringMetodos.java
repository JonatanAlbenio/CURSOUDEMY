public class EJemploStringMetodos {
    public static void main(String[] args) {

        String nombre ="Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());


        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));

        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));


        System.out.println("nombre.equalsIgnoreCase(\"Andres\") = " + nombre.equalsIgnoreCase("Andres"));


        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));


        System.out.println("nombre.compareToIgnoreCase(\"andres\") = " + nombre.compareToIgnoreCase("andres"));


        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));

        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));

        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));

        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));


        System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));


        /////fffgggG_G::GG_G_G__::H:H:H:H::H:H:H::H:H:H:H:H::H:H:H::H:H:H:H::H:H:Hgf
        //Floaaaassrrrrtttttasdasdasdsadasdasdasdasdasdasdasdasdasddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd


        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\"P\") = " + trabalenguas.replace("a","P"));

        System.out.println("trabalenguas = " + trabalenguas);


        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));

        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));

        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));

        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));

        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));

        System.out.println(" trabalenguas".trim() );











    }
}
