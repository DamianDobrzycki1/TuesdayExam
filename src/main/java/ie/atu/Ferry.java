package ie.atu;

public class Ferry extends Ship{
    private String passengerNumber;
    private String ferryName;

    private String yearBuilt;

    public Ferry(){
    }
    public Ferry(String ferryName, String passengerNumber, String yearBuilt ){
        super(ferryName, passengerNumber, yearBuilt);
        this.ferryName = ferryName;
        this.passengerNumber = passengerNumber;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "Ferry " +
                "passengerNumber='" + passengerNumber + '\'' +
                ", ferryName='" + ferryName + '\'' +
                ", yearBuilt= '" + yearBuilt + '\''
                ;
    }
}
