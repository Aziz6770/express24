package cart;

import common.BaseRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CartRepository extends BaseRepository<Cart, UUID> {
    private static final CartRepository cartRepository = new CartRepository();
    public static CartRepository getInstance(){
        return cartRepository;
    }
}
