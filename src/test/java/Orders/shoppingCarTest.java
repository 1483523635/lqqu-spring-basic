package Orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class shoppingCarTest {

    private ShoppingCar shoppingCar;

    @BeforeEach
    void setUp() {
        shoppingCar = new ShoppingCar();
    }

    @Test
    void should_get_shopping_car_items_when_give_prodcuct_id_list_and_user_id_1() {
        List<Integer> products = Arrays.asList(1, 2, 3);
        int userId = 1;
        List<ShoppingCarItem> items = shoppingCar.getItems(userId, products);
        assertThat(items).isEqualTo(Arrays.asList(
                new ShoppingCarItem(1, 1, 1),
                new ShoppingCarItem(1, 2, 2),
                new ShoppingCarItem(1, 3, 3)));
    }

    @Test
    void should_return_empty_when_product_not_exists() {
        List<Integer> products = Arrays.asList(123, 123, 345);
        int userId = 1;
        List<ShoppingCarItem> items = shoppingCar.getItems(userId, products);
        assertThat(items).isEmpty();
    }

    @Test
    void should_return_empty_when_user_id_is_invalid() {
        List<Integer> products = Arrays.asList(1, 2, 3);
        int userId = 11234;
        List<ShoppingCarItem> items = shoppingCar.getItems(userId, products);
        assertThat(items).isEmpty();
    }

    @Test
    void should_return_empty_when_user_id_and_product_both_not_exists() {
        List<Integer> products = Arrays.asList(11234, 2123, 3123);
        int userId = 11234;
        List<ShoppingCarItem> items = shoppingCar.getItems(userId, products);
        assertThat(items).isEmpty();
    }
}
