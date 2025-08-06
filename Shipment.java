public class Shipment{
    private int shipmentId; //should be read-only
    private String originPort;
    private String destinationPort;
    private String status;
    private String cargoDescription;
    private double declaredValue;

    public Shipment(int shipmentId, String originPort, String destinationPort, String status, String cargoDescription, double declaredValue){
        this.shipmentId = shipmentId;
        this.originPort = originPort;
        this.destinationPort = destinationPort;
        this.status = status;
        this.cargoDescription = cargoDescription;
        this.declaredValue = declaredValue;
    }

    public int getShipmentId(){
        return shipmentId;
    }

    public String getOriginPort(){
        return originPort;
    }

    public String getDestinationPort(){
        return destinationPort;
    }

    public String getStatus(){
        return status;
    }

    public String getCargoDescription(){
        return cargoDescription;
    }

    public long getDeclaredValue(){
        return declaredValue;
    }

    public void setStatus(String status){
        this.status = status;
    }
    
    public String getShipmentDetails(){
        String shipmentDetails = String.format(
            """
            Shipment ID: %d%n
            Origin Port: %s%n
            Destination Port: %s%n
            Status: %s%n
            Cargo Description: %s%n
            Declared Value: %d%n
            """,
            getShipmentId(), getOriginPort(), getDestinationPort(), getStatus(), getCargoDescription(), getDeclaredValue()
        );

        return shipmentDetails;
    } 

 

    /*
     * 
     * use this if no need for a return function
     * 
     * 
        public void getShipmentDetails(){

            System.out.printf(
                """
                Shipment ID: %d%n
                Origin Port: %s%n
                Destination Port: %s%n
                Status: %s%n
                Cargo Description: %s%n
                Declared Value: %d%n
                """,
                getShipmentId(), getOriginPort(), getDestinationPort(), getStatus(), getCargoDescription(), getDeclaredValue());
            } 
     */
}