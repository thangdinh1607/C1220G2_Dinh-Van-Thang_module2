package Models;

public class Customer {
    private String nameCustomer;
    private String birthDayCustomer;
    private String genderCustomer;
    private int idCard;
    private int phoneNumber;
    private String emailCustomer;
    private String typeOfCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDayCustomer() {
        return birthDayCustomer;
    }

    public void setBirthDayCustomer(String birthDayCustomer) {
        this.birthDayCustomer = birthDayCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer(String nameCustomer, String birthDayCustomer, String genderCustomer, int idCard, int phoneNumber, String emailCustomer, String typeOfCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String nameCustomer, String birthDayCustomer, String genderCustomer, int idCard, int phoneNumber, String emailCustomer, String typeOfCustomer, String address, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }
    public String showInFor() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDayCustomer='" + birthDayCustomer + '\'' +
                ", genderCustomer='" + genderCustomer + '\'' +
                ", idCard=" + idCard +
                ", phoneNumber=" + phoneNumber +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }
    @Override
    public String toString() {
        return nameCustomer + ","
                +birthDayCustomer+","
                +genderCustomer+","
                + idCard + ","
                + phoneNumber + ","
                + emailCustomer + ","
                + typeOfCustomer + ","
                + address+","
                + services;
    }
}
