package repository;

import java.util.List;

public interface GenericRepository<T> {
    void save(T t);
    void update(T t);
    boolean delete(Long id);
    T findById(Long id);
    List<T> findAll();

}
