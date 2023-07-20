package product;

import common.BaseRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductRepository extends BaseRepository<Products, UUID> {
    private static final ProductRepository productRepository = new ProductRepository();

    public static ProductRepository getInstance(){
        return productRepository;
    }
}
