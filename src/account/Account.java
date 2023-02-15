package account;
import address.Address;
import address.AddressManager;
import insurance.Insurance;
import mainPackage.AuthenticationStatus;
import mainPackage.InvalidAuthenticationException;
import mainPackage.User;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{
    List<Insurance> insuranceList;
    User user;
    AuthenticationStatus status = AuthenticationStatus.FAIL;

    public Account (User user){
        this.user = user;
    }

    boolean addAddress(Address address){
        return AddressManager.addAddress(user,address);
    }
    boolean removeAddress(Address address){
        return AddressManager.removeAddress(user,address);
    }
    AuthenticationStatus getStatus(){
        return status;
    }
    abstract String addPolicy();

    AuthenticationStatus login(String email, String password){
        if (user.getEmail().equals(email) && user.getPassword().equals(password)){
            this.status=AuthenticationStatus.SUCCESS;
            return AuthenticationStatus.SUCCESS;
        }
        throw new InvalidAuthenticationException("the email and/or the password are not correct !");
    }

    final void showUserInfo(){
        System.out.println(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(insuranceList, account.insuranceList) && Objects.equals(user, account.user) && getStatus() == account.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(insuranceList, user, getStatus());
    }

    @Override
    public int compareTo(Account o) {
        return Comparator.comparing(Account::getStatus).compare(this,o);
    }
}
