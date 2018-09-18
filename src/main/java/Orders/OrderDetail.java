package Orders;

import java.util.ArrayList;
import java.util.List;

public class OrderDetail {
    private int id;

    public int getId() {
        return id;
    }

    public List<OrderDetailItem> getOrderDetailItems() {
        return orderDetailItems;
    }

    private List<OrderDetailItem> orderDetailItems = new ArrayList<>();

    public OrderDetail(int userId, List<ProductItem> productItems, List<ShoppingCarItem> shoppingCarItems) {
        this.id = userId;
        productItems.forEach(productItem -> {
            shoppingCarItems.forEach(shoppingCarItem -> {
                if (shoppingCarItem.getUserId() == userId && shoppingCarItem.getProductId() == productItem.getId()) {
                    orderDetailItems.add(new OrderDetailItem(productItem.getName(), productItem.getPrice() * shoppingCarItem.getCount(), shoppingCarItem.getCount()));
                }
            });
        });
    }
}
