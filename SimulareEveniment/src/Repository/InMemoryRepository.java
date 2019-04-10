package Repository;

import Domain.Entity;
import Domain.IValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryRepository<T extends Entity> {

    private Map<Integer, T> storage = new HashMap<>();
    private IValidator validator;

    public T findById(String id) {
        return null;
    }

    public void upsert(T entity) {
        validator.validate(entity);
        storage.put(entity.getId(), entity);
    }

    public void remove(String id) {

    }

    public ArrayList<T> getAll(){
        return new ArrayList<>(storage.values());
    }
}
