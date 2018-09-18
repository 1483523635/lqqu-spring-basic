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
    void should_get_shopping_car_items_when_give_product_id_list_and_user_id() {
        List<Integer> productIds = Arrays.asList(1, 2, 3);
        int userId = 1;
        assertThat(shoppingCar.getItems(userId, productIds)).isEqualTo(Arrays.asList(
                new ShoppingCarItem(1, 1, 1),
                new ShoppingCarItem(1, 2, 2),
                new ShoppingCarItem(1, 3, 3)));
    }

    @Test
    void should_return_empty_when_product_id_list_not_exists() {
        List<Integer> productIds = Arrays.asList(123, 123, 345);
        int userId = 1;
        assertThat(shoppingCar.getItems(userId, productIds)).isEmpty();
    }

    @Test
    void should_return_empty_when_user_id_not_exists() {
        List<Integer> productIds = Arrays.asList(1, 2, 3);
        int userId = 11234;
        assertThat(shoppingCar.getItems(userId, productIds)).isEmpty();
    }

    @Test
    void should_return_empty_when_user_id_and_product_id_list_both_not_exists() {
        List<Integer> productIds = Arrays.asList(11234, 2123, 3123);
        int userId = 11234;
        assertThat(shoppingCar.getItems(userId, productIds)).isEmpty();
    }
}
