package address;

public class BusinessAddress extends Address{
    public BusinessAddress(String country, String province, String city, String neighbourhood, String street, String buildingAndApartment) {
        super(country, province, city, neighbourhood, street, buildingAndApartment);
    }
    public BusinessAddress(){}

    @Override
    public String getAddress() {
        return "Business address.Address :"+"\n"+
                super.getAddress();
    }
}
