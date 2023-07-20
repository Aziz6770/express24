import order.Order;
import order.OrderRepository;
import restaurant.Restaurant;
import restaurant.RestaurantRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        RestaurantRepository restaurantRepository = RestaurantRepository.getInstance();
        UUID id = UUID.randomUUID();
        restaurantRepository.add(new Restaurant(id, LocalDateTime.now(), LocalDateTime.now(), null, null, "Chorsu", "Feed op "));



    }
}
