package order;

import common.BaseEntity;
import lombok.*;
import product.Products;
import user.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@EqualsAndHashCode (callSuper = true)
@ToString (callSuper = true)
public class Order extends BaseEntity<UUID> {
    private UUID userId;
    private UUID restaurantId;
    private UUID cookId;
    private UUID courierId;
    private List<Products> products;
    private OrderStatus status;

    public Order(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy,
                 UUID userId, UUID restaurantId, UUID cookId, UUID courierId, List<Products> products, OrderStatus status) {
        super(id, created, modified, createdBy, modifiedBy);
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.cookId = cookId;
        this.courierId = courierId;
        this.products = products;
        this.status = status;
    }
}
