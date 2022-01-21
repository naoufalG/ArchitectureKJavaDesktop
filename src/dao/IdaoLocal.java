package dao;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IdaoLocal<T> {
	boolean create(T p);

	boolean update(T p);

	boolean delete(int id);

	T findById(int id);

	List<T> findAll();
}
