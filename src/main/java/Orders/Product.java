package Orders;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private final List<ProductItem> productItems;

    public Product() {
        this.productItems = Arrays.asList(
                new ProductItem(1, "手机", 1000D),
                new ProductItem(2, "手机", 1002D),
                new ProductItem(3, "钢化膜", 10),
                new ProductItem(4, "钢化膜", 10),
                new ProductItem(5, "手环", 100));
    }

    public List<ProductItem> getProducts(List<Integer> productIds) {
        return productItems.stream().filter(productItem -> productIds.contains(productItem.getId())).collect(Collectors.toList());
    }
}
