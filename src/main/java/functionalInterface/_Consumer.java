package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Normal Java Function
        Customer rafa = new Customer("Rafa", "+34 685 30 54 68");
        greetCostumer(rafa);

        //Consumer Functional Interface
        greetCostumerConsumer.accept(rafa);

        //BiConsumer
        greetCostumerConsumerV2.accept(rafa, false);
    }

    static BiConsumer<Customer, Boolean> greetCostumerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "***"));

    static Consumer<Customer> greetCostumerConsumer = customer ->
            System.out.println("Hello "+customer.customerName + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greetCostumer(Customer customer) {
        System.out.println("Hello "+customer.customerName + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
