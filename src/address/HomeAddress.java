package address;

public class HomeAddress extends Address{
    public HomeAddress(String country, String province, String city, String neighbourhood, String street, String buildingAndApartment) {
        super(country, province, city, neighbourhood, street, buildingAndApartment);
    }
    //public HomeAddress(){}
    @Override
    public String getAddress() {
        return "Home address.Address :\n"+
                super.getAddress();
    }
}
