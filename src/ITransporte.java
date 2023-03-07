public interface ITransporte {
    /**
     * Interfaz para todos los posibles transportes
     */
    static final int CP = 36000;

    /**
     * Metodo para calcular el coste del envío
     * @param cp codigo postal
     * @return coste total del envío
     */
    Float costeTotal(Integer cp);

    /**
     * Metodo para saber el tipo de embalaje del envío
     * @param dimx dimension x del paquete
     * @param dimy dimension y del paquete
     * @param dimz dimension z del paquete
     * @param peso del paquete
     * @return un entero indicando el tipo de embalaje del paquete
     */
    Integer tipoEmbalaje(Float dimx, Float dimy, Float dimz, Float peso);
}
