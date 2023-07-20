package common;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

public interface Service<ENTITY, ID> {
    Optional<ENTITY> findById(ID id);
    List<ENTITY> findAll();
    void add (ENTITY entity);
    void delete (ID id);
}
