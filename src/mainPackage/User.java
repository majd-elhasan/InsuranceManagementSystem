package mainPackage;

import address.Address;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private ArrayList<Address> addresses = new ArrayList<>();
    private LocalDate lastEntryToTheSystem = LocalDate.now();

    public User(String name, String lastName, String email, String password, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public LocalDate getLastEntryToTheSystem() {
        return lastEntryToTheSystem;
    }

    public void setLastEntryToTheSystem(LocalDate lastEntryToTheSystem) {
        this.lastEntryToTheSystem = lastEntryToTheSystem;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                ", addresses=" + addresses +
                ", lastEntryToTheSystem=" + lastEntryToTheSystem +
                '}';
    }
}
