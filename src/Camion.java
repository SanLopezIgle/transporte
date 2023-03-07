public class Camion implements ITransporte{
    public static int PALET=0;
    public static int CAJA_CARTON=1;
    public static int CAJA_MADERA=2;

    /**
     * Constructor
     */
    public Camion() {
    }

    /**
     * Metodo que calcula el coste del envio
     * @param cp codigo postal
     * @return coste total del envio
     */
    @Override
    public Float costeTotal(Integer cp) {
        Float costeTotal = null;
        if(cp > 36000) costeTotal = Float.valueOf(cp * 0.9f);
        else costeTotal = Float.valueOf(cp * 1.5f);
        return costeTotal;
    }

    /**
     * Metodo que mira que tipo de embalaje necesita nuestro paquete
     * @param dimx dimension x del paquete
     * @param dimy dimension y del paquete
     * @param dimz dimension z del paquete
     * @param peso del paquete
     * @return un entero indicando el tipo de embalaje del paquete
     */
    @Override
    public Integer tipoEmbalaje(Float dimx, Float dimy, Float dimz, Float peso) {
        Float volumen = dimx * dimy * dimz;
        if(volumen > 100){
            return PALET;
        }else {
            if (peso < 10) {
                return CAJA_CARTON;
            } else {
                return CAJA_MADERA;
            }
        }
    }
}
