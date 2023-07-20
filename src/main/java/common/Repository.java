package common;

import java.util.List;
import java.util.Optional;

public interface Repository<ENTITY extends BaseEntity<ID>, ID> {
    Optional<ENTITY> findById (ID id);

    List<ENTITY> findAll();

    void add (ENTITY entity);

    void delete (ID id);
}
