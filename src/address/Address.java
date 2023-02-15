package address;

public abstract class Address implements IAddress{
    String country ;
    String province;
    String city;
    String neighbourhood;
    String Street;
    String buildingAndApartment;

    public Address(String country, String province, String city, String neighbourhood, String street, String buildingAndApartment) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.neighbourhood = neighbourhood;
        Street = street;
        this.buildingAndApartment = buildingAndApartment;
    }
    public Address(){}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getBuildingAndApartment() {
        return buildingAndApartment;
    }

    public void setBuildingAndApartment(String buildingAndApartment) {
        this.buildingAndApartment = buildingAndApartment;
    }

    @Override
    public String getAddress() {
        return "Country : "+getCountry()+"\n"+
                "Province : "+getProvince()+"\n"+
                "City : "+getCity()+"\n"+
                "Neighbourhood : "+getNeighbourhood()+"\n"+
                "Street : "+getStreet()+"\n"+
                "Building And Apartment : "+getBuildingAndApartment()+"\n";
    }
}
