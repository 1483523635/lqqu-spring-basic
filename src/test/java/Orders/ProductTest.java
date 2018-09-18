package Orders;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ProductTest {
    @Test
    void should_get_product_list_when_given_a_product_id_list() {
        List<Integer> productIds = Arrays.asList(1, 2, 3);
        Product product = new Product();
        assertThat(product.getProducts(productIds)).isEqualTo(Arrays.asList(
                new ProductItem(1, "手机", 1000D),
                new ProductItem(2, "手机", 1002D),
                new ProductItem(3, "钢化膜", 10)));

    }

    @Test
    void should_return_empty_when_not_contains_product_id_list() {
        List<Integer> productIds = Arrays.asList(111,222,333);
        Product product = new Product();
        assertThat(product.getProducts(productIds)).isEmpty();
    }
}
