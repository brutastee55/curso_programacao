package exercicios.exerciciosComposicaoEnumeracao.exercicio.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private final List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItems(OrderItem items) {
        this.items.add(items);
    }

    public void removeiItems(OrderItem items) {
        this.items.remove(items);
    }

    public double total() {
        double sum = 0.0;
//        for (int i = 0; i < items.size(); i++) {
//            sum += items.get(i).subTotal();
//        }
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: ").append("\n");
        sb.append(sdf.format(getMoment())).append("\n");
        sb.append("Order status: ");
        sb.append(getStatus()).append("\n");
        sb.append("Cliente: ");
        sb.append(getClient()).append("\n");
        sb.append("Order items:").append("\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
