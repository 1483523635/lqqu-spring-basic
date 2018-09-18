package Orders;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ProductTest {
    @Test
    void should_get_product_list_when_given_a_product_id_list() {
        List<Integer> productIds = Arrays.asList(1, 2, 3);
        Product product = new Product();
        List<ProductItem> products = product.getProducts(productIds);
        assertIterableEquals(Arrays.asList(
                new ProductItem(1, "手机", 1000D),
                new ProductItem(2, "手机", 1002D),
                new ProductItem(3, "钢化膜", 10)), products);
    }
}
