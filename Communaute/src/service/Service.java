package service;

import java.util.List;

public interface Service <T>{
	
	public void delete (T entity);
	public void insert (T entity);
	public T findById (int id);
	public List<T> findAll();
	public void update(T entity);

}
