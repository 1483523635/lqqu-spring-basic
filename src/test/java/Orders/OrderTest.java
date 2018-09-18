package Orders;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class OrderTest {
    @Test
    void should_generate_order() {
        Order order = new Order();
        OrderDetail orderDetail = order.getOrderDetail(1, Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(1, orderDetail.getId());
        assertIterableEquals(Arrays.asList(
                new OrderDetailItem("手机", 1000.0, 1),
                new OrderDetailItem("手机", 2004, 2),
                new OrderDetailItem("钢化膜", 30.0, 3)), orderDetail.getOrderDetailItems());

    }
}
