package restaurant;

import common.BaseRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantRepository extends BaseRepository<Restaurant, UUID> {
    private static final RestaurantRepository restaurants = new RestaurantRepository();
    public static RestaurantRepository getInstance(){
        return restaurants;
    }
}
