package Repository;

import Domain.Entity;

import java.util.ArrayList;

public interface IRepository <T extends Entity>{

    T findById(int id);
    void upsert(T id);

    void remove(int id);
    ArrayList<T> getAll();
}
