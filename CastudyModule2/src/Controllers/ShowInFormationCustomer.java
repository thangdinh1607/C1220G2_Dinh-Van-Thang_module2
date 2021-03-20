package Controllers;

import Commons.CustomerSortName;
import Commons.ReaderFile;
import Models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShowInFormationCustomer {
    void showInformationCustomer() {
        ReaderFile rf = new ReaderFile();
        List<String[]> customerList = new ArrayList<>(rf.readerFile(AddNewServices.LINK_CUSTOMER));
        List<Customer> customerList1 = new ArrayList<>();
        for (String[] e : customerList) {
            Customer customer = new Customer();
            customer.setNameCustomer(e[0]);
            customer.setBirthDayCustomer(e[1]);
            customer.setGenderCustomer(e[2]);
            customer.setIdCard(Integer.parseInt(e[3]));
            customer.setPhoneNumber(Integer.parseInt(e[4]));
            customer.setEmailCustomer(e[5]);
            customer.setTypeOfCustomer(e[6]);
            customer.setAddress(e[7]);

            customerList1.add(customer);
        }
        Collections.sort(customerList1,new CustomerSortName());
        int i=1;
        for(Customer customer :customerList1){
            System.out.println(i +". " + customer.showInFor());
            i++;
        }
    }
}
