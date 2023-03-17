public class Main {
    public static void main(String[] args) {
        ITransporte transporte = FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
        System.out.println("Coste total = " + transporte.costeTotal(36789));
        System.out.println("Tipo de embalaje: " + transporte.tipoEmbalaje(1f, 0.5f, 0.3f, 30f));

        ITransporte transporte1 = FactoryTransporte.getTransporte(FactoryTransporte.BARCO);
        System.out.println("Barco: ");
        System.out.println("Coste total = " + transporte1.costeTotal(36458));
        System.out.println("Tipo de embalaje: " + transporte1.tipoEmbalaje(3f, 1f, 0.7f, 100f));
    }
}