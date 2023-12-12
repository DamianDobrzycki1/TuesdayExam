package ie.atu;

public class Trawler extends Ship{
    private String ton;
    private String ShipName;
    private String ShipCargo;

    public Trawler(){
    }
    public Trawler(String ton, String ShipName, String ShipCargo){
        super(ton, ShipName, ShipCargo);
        this.ton = ton;
        this.ShipName = ShipName;
        this.ShipCargo = ShipCargo;
    }

    @Override
    public String toString() {
        return "Trawler " +
                "ton='" + ton + '\'' +
                ", ShipName='" + ShipName + '\'' +
                ", ShipCargo='" + ShipCargo + '\''
                ;
    }
}
