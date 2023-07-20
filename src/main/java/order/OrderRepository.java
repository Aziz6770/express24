package order;

import common.BaseRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderRepository extends BaseRepository<Order, UUID> {
    private static final OrderRepository orderRepository = new OrderRepository();

    public static OrderRepository getInstance(){
        return orderRepository;
    }
}
