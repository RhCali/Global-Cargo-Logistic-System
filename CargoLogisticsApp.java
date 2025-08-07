public class CargoLogisticsApp {
    public static void main(String[] args){
        Shipment shipment1 = new Shipment("1", "Manila", "Busan", "Pending", "Electronics delivery", 10000.0);
        Shipment shipment2 = new Shipment("2", "Tokyo", "Hong Kong", "Pending", "Furniture delivery", 5000.0);

        CargoShip cargoShip1 = new CargoShip("Cargo Ship 1", "Captain Hook", 20, 80);
        CargoShip cargoShip2 = new CargoShip("Cargo Ship 2", "Captain Jack", 200, 40);

        Shipment laptopShipment = new Shipment("3", "Singapore", "Manila", "Pending", "Laptop delivery", 100.0);

        cargoShip1.loadCargo(laptopShipment);
        laptopShipment.setStatus("In Transit");
        System.out.println(laptopShipment.getShipmentDetails());

        cargoShip1.unloadCargo(laptopShipment);
        laptopShipment.setStatus("Delivered");
        System.out.println(laptopShipment.getShipmentDetails());

        if(laptopShipment.getStatus().equals("Delivered")){
            System.out.println("Shipment ID: " + laptopShipment.getShipmentId() + " is currently " +  laptopShipment.getStatus());
        } else if(laptopShipment.getStatus().equals("Pending")){
            System.out.println("Shipment ID: " + laptopShipment.getShipmentId() + " is currently " +  laptopShipment.getStatus());
        } else if(laptopShipment.getStatus().equals("In Transit")){
            System.out.println("Shipment ID: " + laptopShipment.getShipmentId() + " is currently " +  laptopShipment.getStatus());
        }
    }
}
