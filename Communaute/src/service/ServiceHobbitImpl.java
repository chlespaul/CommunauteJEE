package service;

import java.util.List;

import bean.Hobbit;
import dao.DAOArmeImpl;
import dao.DAOHobbitImpl;

public class ServiceHobbitImpl implements ServiceHobbit{
	
	@Override
	public void delete(Hobbit entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Hobbit entity) {
		// TODO Auto-generated method stub
		DAOArmeImpl daoArmeImpl = new DAOArmeImpl();
		daoArmeImpl.insert(entity.getArme());
		
		DAOHobbitImpl daoHobbitImpl = new DAOHobbitImpl();
		daoHobbitImpl.insert(entity);
	}

	@Override
	public Hobbit findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hobbit> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Hobbit entity) {
		// TODO Auto-generated method stub
		
	}
	
}