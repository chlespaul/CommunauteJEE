package dao;

import java.util.List;

public interface Dao <T>{
	
	public void delete (T entity);
	public void insert (T entity);
	public T findById (int id);
	public List<T> findAll();
	public void update(T entity);
}
