public class Furgoneta extends Coche {

    // CARACTERÍSTICAS PROPIAS DE LA CLASE FURGONETA

    private int capacidad_carga;
    private int plazas_extra;

    // ESTADO INICIAL DE FURGONETA

    public Furgoneta(int plazas_extra, int capacidad_carga) {

        super(); // SIRVE PARA LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE (EN ESTE CASO DE COCHE)

        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;

    }

    public String dimeDatosFurgoneta() {

        return "La capacidad de carga es: " + capacidad_carga + ". Y las plazas son: " + plazas_extra;

    }

}
