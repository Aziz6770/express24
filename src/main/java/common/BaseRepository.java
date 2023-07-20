package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class BaseRepository<ENTITY extends BaseEntity<ID>, ID> implements Repository<ENTITY, ID> {
    private final List<ENTITY> entities = new ArrayList<>();
    @Override
    public Optional<ENTITY> findById(ID id) {
        return entities.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<ENTITY> findAll() {
        return entities;
    }

    @Override
    public void add(ENTITY entity) {
        entities.add(entity);
    }

    @Override
    public void delete(ID id) {
        entities.removeIf( entity -> entity.getId().equals(id));
    }
}
