public class Bici implements ITransporte{
    public static int CAJA_CARTON=1;
    public static int CAJA_MADERA=2;
    /**
     * Constructor
     */
    public Bici() {
    }

    /**
     * Metodo para saber el coste del envio
     * @param cp codigo postal
     * @return coste total del envio
     */
    @Override
    public Float costeTotal(Integer cp) {
        Float costeTotal = null;
        if(cp > 36000) costeTotal = Float.valueOf(cp * 0.1f);
        else costeTotal = Float.valueOf(cp * 1f);
        return costeTotal;
    }

    /**
     * Metodo para saber que tipo de embalaje necesita el envio
     * @param dimx dimension x del paquete
     * @param dimy dimension y del paquete
     * @param dimz dimension z del paquete
     * @param peso del paquete
     * @return un entero indicando el tipo de embalaje del envio
     */
    @Override
    public Integer tipoEmbalaje(Float dimx, Float dimy, Float dimz, Float peso) {
        Float volumen = dimx * dimy * dimz;

        if(volumen < 10 && peso <5){
            return CAJA_CARTON;
        }
        else {
            return CAJA_MADERA;
        }
    }
}
