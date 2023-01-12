public class Uso_Vehiculo {

    public static void main(String[] args) {

        // OBJETO O INSTANCIA DE LA CLASE COCHE

        Coche micoche1 = new Coche();
        micoche1.establece_color("Rojo");

        // OBJETO O INSTANCIA DE LA CLASE FURGONETA

        Furgoneta mifurgoneta1 = new Furgoneta(7,580);
        mifurgoneta1.establece_color("Blanco");
        mifurgoneta1.configura_asientos("Si");
        mifurgoneta1.configura_climatizador("Si");

        System.out.println(micoche1.dime_datos_generales() + ". " + micoche1.dime_color());
        System.out.println(mifurgoneta1.dime_datos_generales() + ". " + mifurgoneta1.dimeDatosFurgoneta());


    }

}
