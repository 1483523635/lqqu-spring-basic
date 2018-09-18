package Orders;

import java.util.Objects;

public class OrderDetailItem {
    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private final int count;
    private final double price;
    private final String name;

    public OrderDetailItem(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderDetailItem that = (OrderDetailItem) o;
        return count == that.count &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, price, name);
    }
}
