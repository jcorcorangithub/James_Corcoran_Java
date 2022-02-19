package myCompany;


public class App {
    public static void main(String[] args) {
        Address billingAddress = new Address("martin st","florida avenue","northport","NY","64773");
        Address shippingAddress = new Address("joyce st","amber avenue","massapequa","NY","64773");

        Customer customer = new Customer("James","corc","email", "7775343",shippingAddress, billingAddress, false);


    }
}
