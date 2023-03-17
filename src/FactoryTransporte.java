public class FactoryTransporte {
        public final static int CAMION=1;
        public final static int BICI=2;
        public final static int BARCO=3;

        public static ITransporte getTransporte(int tipoTransporte){
            switch (tipoTransporte){
                case CAMION:
                    return new Camion();
                case BICI:
                    return new Bici();
                case BARCO:
                    return new Barco();
                default:
                    return null;
            }
        }
}
