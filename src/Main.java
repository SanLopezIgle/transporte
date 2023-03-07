public class Main {
    public static void main(String[] args) {
        ITransporte transporte = FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
        System.out.println("Coste total = " + transporte.costeTotal(36789));
        System.out.println("Tipo de embalaje: " + transporte.tipoEmbalaje(1f, 0.5f, 0.3f, 30f));
    }
}