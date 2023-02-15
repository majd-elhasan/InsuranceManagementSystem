package address;

import mainPackage.User;

public class AddressManager {
   public static boolean addAddress(User user, Address address){
        int c=0;
        for(Address ad : user.getAddresses()){
            if (ad.equals(address)) break;
            c++;
        }
        if (c== user.getAddresses().size()){
           user.getAddresses().add(address);
            return true;
        }
        return false;
    }
    public static boolean removeAddress(User user, Address address){
       return user.getAddresses().remove(address);
    }
}
