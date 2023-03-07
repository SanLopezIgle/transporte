public class FactoryTransporte {
        public final static int CAMION=1;
        public final static int BICI=2;

        public static ITransporte getTransporte(int tipoTransporte){
            switch (tipoTransporte){
                case CAMION:
                    return new Camion();
                case BICI:
                    return new Bici();
                default:
                    return null;
            }
        }
}
