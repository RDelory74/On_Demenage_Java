public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        double nbCartons = 34.0;
        System.out.println("Il y a " + nbCartons + " cartons dans le local.");
        double truckCapacity = 9.0;
        System.out.println("Et le camion à une capacité de " + truckCapacity + " cartons par voyages.");
        double nbVoyages = nbCartons / truckCapacity;
        System.out.println("Il faudra faire " + Math.round(nbVoyages) + " voyages.");

        while(nbCartons > 0.0 && truckCapacity < nbCartons) {
            nbCartons -= truckCapacity;
            System.out.println("Un voyage de " + truckCapacity + " cartons.");
            System.out.println("Il reste " + nbCartons + " au locale.");
        }
        System.out.println("Dernier voyage avec " + nbCartons + " dans le camion.");
    }
}
