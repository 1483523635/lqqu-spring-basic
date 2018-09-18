package Orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class OrderTest {
    Order order;

    @BeforeEach
    void init() {
        order = new Order();
    }

    @Test
    void should_generate_order() {

        OrderDetail orderDetail = order.getOrderDetail(1, Arrays.asList(1, 2, 3, 4, 5));
        assertThat(orderDetail.getId()).toString().substring(0, 1).equals(1);
        assertThat(orderDetail.getOrderDetailItems()).isEqualTo(Arrays.asList(
                new OrderDetailItem("手机", 1000.0, 1),
                new OrderDetailItem("手机", 2004, 2),
                new OrderDetailItem("钢化膜", 30.0, 3)));
    }


    @Test
    void should_return_empty_when_given_user_id_not_contains() {
        OrderDetail orderDetail = order.getOrderDetail(123, Arrays.asList(1, 2, 3, 4, 5));
        assertThat(orderDetail.getOrderDetailItems()).isEmpty();
    }


    @Test
    void should_return_empty_when_product_ids_not_contains() {
        OrderDetail orderDetail = order.getOrderDetail(1, Arrays.asList(1123, 2123, 3434, 4543, 5233));
        assertThat(orderDetail.getOrderDetailItems()).isEmpty();
    }
    @Test
    void should_return_empty_when_given_products_ids_and_user_id_both_not_contains() {
        OrderDetail orderDetail = order.getOrderDetail(11234, Arrays.asList(1123, 2123, 3434, 4543, 5233));
        assertThat(orderDetail.getOrderDetailItems()).isEmpty();
    }
}
