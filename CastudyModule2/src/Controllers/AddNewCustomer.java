package Controllers;

import Commons.NameException;
import Commons.RegularExpression;
import Commons.WriteFile;
import Models.Customer;
import Models.Services;

import java.util.Scanner;

public class AddNewCustomer {
    Scanner scanner = new Scanner(System.in);
    RegularExpression re = new RegularExpression();

    void addNewCustomer() throws Exception {
        String nameCustomer = re.checkNameCustomer();
        String birthDayCustomer = re.checkBirthDayCustomer();
        String gender = re.checkGenderCustomer();
        int idCard = re.checkIdCardCustomer();
        int phoneNumberCustomer = re.checkPhoneNumberCustomer();
        String emailCustomer = re.checkEmailCustomer();
        String typeOfCustomer = re.typeOfCustomer();
        String address = re.checkAddressCustomer();

        Customer customer = new Customer(nameCustomer, birthDayCustomer, gender, idCard, phoneNumberCustomer, emailCustomer, typeOfCustomer, address);
        WriteFile wf = new WriteFile();
        wf.writeFile(AddNewServices.LINK_CUSTOMER, customer);
    }
}
