import Enum.OrderStatus;

public class Order {
    private int orderNumber;
    private String customerName;
    private Product product;
    private OrderStatus orderStatus;

    Order(int orderNumber, String customerName, Product product, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.product = product;
        this.orderStatus = orderStatus.NEW;
    }

    Order(int orderNumber, String customerName, Product product) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.product = product;
        this.orderStatus = orderStatus.NEW;
    }

    int getOrderNumber() {
        return orderNumber;
    };

    String getCustomerName() {
        return customerName;
    }
}
