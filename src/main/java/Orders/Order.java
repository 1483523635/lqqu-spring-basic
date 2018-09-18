package Orders;

import java.util.List;

public class Order {
    public OrderDetail getOrderDetail(int userId, List<Integer> productIds) {
        List<ShoppingCarItem> shoppingCarItems = (new ShoppingCar()).getItems(userId, productIds);
        List<ProductItem> productItems = (new Product()).getProducts(productIds);
        return new OrderDetail(userId, productItems, shoppingCarItems);
    }
}
