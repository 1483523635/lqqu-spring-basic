package Orders;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class shoppingCarTest {
    @Test
    void should_get_shopping_car_items_when_give_prodcuct_id_list_and_user_id_1() {
        ShoppingCar shoppingCar = new ShoppingCar();
        List<Integer> products = Arrays.asList(1, 2, 3);
        int userId = 1;
        List<ShoppingCarItem> items = shoppingCar.getItems(userId, products);
        assertThat(items).isEqualTo(Arrays.asList(
                new ShoppingCarItem(1, 1, 1),
                new ShoppingCarItem(1, 2, 2),
                new ShoppingCarItem(1, 3, 3)));
    }
}
