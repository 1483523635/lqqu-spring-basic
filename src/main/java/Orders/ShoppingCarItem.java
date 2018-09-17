package Orders;

import java.util.Objects;

public class ShoppingCarItem {

    private int count;
    private int userId;
    private int productId;


    public ShoppingCarItem() {
        count = 0;
        userId = 0;
        productId = 0;
    }

    public ShoppingCarItem(int userId, int productId, int count) {
        this.userId = userId;
        this.productId = productId;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCarItem that = (ShoppingCarItem) o;
        return count == that.count &&
                userId == that.userId &&
                productId == that.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userId, productId);
    }
}
