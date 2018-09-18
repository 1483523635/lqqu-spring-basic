package Orders;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetail {
    private long id;

    public long getId() {
        return id;
    }

    public List<OrderDetailItem> getOrderDetailItems() {
        return orderDetailItems;
    }

    private List<OrderDetailItem> orderDetailItems = new ArrayList<>();

    public OrderDetail(long userId, List<ProductItem> productItems, List<ShoppingCarItem> shoppingCarItems) {
        this.id = generateOrderId(userId);
        productItems.forEach(productItem -> {
            shoppingCarItems.forEach(shoppingCarItem -> {
                if (shoppingCarItem.getUserId() == userId && shoppingCarItem.getProductId() == productItem.getId()) {
                    orderDetailItems.add(new OrderDetailItem(productItem.getName(), productItem.getPrice() * shoppingCarItem.getCount(), shoppingCarItem.getCount()));
                }
            });
        });
    }

    private long generateOrderId(long userId) {
        long curTimeSpan = new Date().getTime();
        return Long.parseLong(String.format("%d%d", userId, curTimeSpan));
    }
}
