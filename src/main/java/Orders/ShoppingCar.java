package Orders;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCar {

    List<ShoppingCarItem> shoppingCarItemList;

    public ShoppingCar() {
        shoppingCarItemList = Arrays.asList(
                new ShoppingCarItem(1, 1, 1),
                new ShoppingCarItem(1, 2, 2),
                new ShoppingCarItem(1, 3, 3),
                new ShoppingCarItem(2, 1, 1),
                new ShoppingCarItem(2, 2, 2),
                new ShoppingCarItem(2, 3, 3));
    }

    public List<ShoppingCarItem> getItems(int userId, List<Integer> products) {
        return shoppingCarItemList.stream().filter(item -> {
            if (item.getUserId() != userId) {
                return false;
            }
            if (!products.contains(item.getProductId())) {
                return false;
            }
            return true;
        }).collect(Collectors.toList());
    }
}
