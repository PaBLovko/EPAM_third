package by.epam.intro.task5;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerArray {
    private Customer[] customers;

    public CustomerArray(Customer[] customers) {
        this.customers = customers;
    }

    public void setCustomerArray(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomerArray() {
        return customers;
    }

    public Customer[] sort(Customer[] customers) {
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (!o1.getSecondName().equals(o2.getSecondName())) {
                    return o1.getSecondName().compareTo(o2.getSecondName());
                } else if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                } else
                    return o1.getThirdName().compareTo(o2.getThirdName());
            }
        });
        return customers;
    }

    public Customer[] findCustomers(Customer[] customers, int lowerRangeLimit, int upperRangeLimit) {
        Customer[] goodCustomers = new Customer[customers.length];
        int k = 0;
        for (int i = 0; i < customers.length; i++) {
            if (givenRange(customers[i], lowerRangeLimit, upperRangeLimit)) {
                goodCustomers[k] = customers[i];
                k++;
            }
        }
        return goodCustomers;
    }

    private boolean givenRange(Customer customer, int lowerRangeLimit, int UpperRangeLimit) {
        if (lowerRangeLimit < customer.getBankAccountNumber() && customer.getBankAccountNumber() < UpperRangeLimit)
            return true;
        return false;
    }
}
