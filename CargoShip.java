public class CargoShip extends Ship {

    public CargoShip(String shipName, String captainName, double speedKnots, int fuelLevelPercentage) {
        super(shipName, captainName, speedKnots, fuelLevelPercentage);
    }

    public void loadCargo(Shipment shipment) {
        System.out.println("Loading Shipment " + shipment.getShipmentId() + " to " + getShipName());
        shipment.setStatus("Loaded on " + getShipName());
    }

    public void unloadCargo(Shipment shipment) {
        System.out.println("Unloading Shipment " + shipment.getShipmentId() + " from " + getShipName());
        shipment.setStatus("Unloaded from " + getShipName());
    }
}