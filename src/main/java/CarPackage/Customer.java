package CarPackage;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerID")
    private int customerId;
    @Basic
    @Column(name = "Firstname")
    private String firstname;
    @Basic
    @Column(name = "Lastname")
    private String lastname;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "Street")
    private String street;
    @Basic
    @Column(name = "HouseNumber")
    private int houseNumber;
    @Basic
    @Column(name = "ZipCode")
    private int zipCode;
    @Basic
    @Column(name = "City")
    private String city;
    @Basic
    @Column(name = "PhoneNumber")
    private int phoneNumber;
    @Basic
    @Column(name = "IBAN")
    private String iban;
    @Basic
    @Column(name = "DriverLicenseNumber")
    private Date driverLicenseNumber;
    @Basic
    @Column(name = "DriverLicenceExpirationDate")
    private Date driverLicenceExpirationDate;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Date getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(Date driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public Date getDriverLicenceExpirationDate() {
        return driverLicenceExpirationDate;
    }

    public void setDriverLicenceExpirationDate(Date driverLicenceExpirationDate) {
        this.driverLicenceExpirationDate = driverLicenceExpirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != customer.customerId) return false;
        if (houseNumber != customer.houseNumber) return false;
        if (zipCode != customer.zipCode) return false;
        if (phoneNumber != customer.phoneNumber) return false;
        if (firstname != null ? !firstname.equals(customer.firstname) : customer.firstname != null) return false;
        if (lastname != null ? !lastname.equals(customer.lastname) : customer.lastname != null) return false;
        if (email != null ? !email.equals(customer.email) : customer.email != null) return false;
        if (street != null ? !street.equals(customer.street) : customer.street != null) return false;
        if (city != null ? !city.equals(customer.city) : customer.city != null) return false;
        if (iban != null ? !iban.equals(customer.iban) : customer.iban != null) return false;
        if (driverLicenseNumber != null ? !driverLicenseNumber.equals(customer.driverLicenseNumber) : customer.driverLicenseNumber != null)
            return false;
        if (driverLicenceExpirationDate != null ? !driverLicenceExpirationDate.equals(customer.driverLicenceExpirationDate) : customer.driverLicenceExpirationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + houseNumber;
        result = 31 * result + zipCode;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + phoneNumber;
        result = 31 * result + (iban != null ? iban.hashCode() : 0);
        result = 31 * result + (driverLicenseNumber != null ? driverLicenseNumber.hashCode() : 0);
        result = 31 * result + (driverLicenceExpirationDate != null ? driverLicenceExpirationDate.hashCode() : 0);
        return result;
    }
}
