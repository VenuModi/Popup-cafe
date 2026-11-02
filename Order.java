public class Order {
    private int orderNumber;
    private String customerName;

    Order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    int getOrderNumber() {
        return orderNumber;
    };

    String getCustomerName() {
        return customerName;
    }

}
