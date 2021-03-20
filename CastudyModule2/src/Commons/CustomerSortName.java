package Commons;

import Models.Customer;

import java.util.Comparator;

public class CustomerSortName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getNameCustomer().equals(o2.getNameCustomer())) {
            String[] arrBirthDay1 = o1.getBirthDayCustomer().split("/");
            String[] arrBirthDay2 = o2.getBirthDayCustomer().split("/");
            return Integer.parseInt(arrBirthDay1[arrBirthDay1.length - 1]) - Integer.parseInt(arrBirthDay2[arrBirthDay2.length - 1]);
        }
        return o1.getNameCustomer().compareTo(o2.getNameCustomer());
    }
}
