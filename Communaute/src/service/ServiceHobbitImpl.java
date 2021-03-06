package service;

import java.util.List;
import bean.Hobbit;
import bean.Arme;
import dao.DAOArmeImpl;
import dao.DAOHobbitImpl;

public class ServiceHobbitImpl implements ServiceHobbit{
	
	@Override
	public void delete(Hobbit entity) {
		// TODO Auto-generated method stub
		DAOArmeImpl daoArmeImpl = new DAOArmeImpl();
		daoArmeImpl.delete(entity.getArme());
		
		DAOHobbitImpl daoHobbitImpl = new DAOHobbitImpl();
		daoHobbitImpl.delete(entity);
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
		DAOHobbitImpl daoHobbitImpl = new DAOHobbitImpl();
		Hobbit h = daoHobbitImpl.findById(entity);
		DAOArmeImpl daoArmeImpl = new DAOArmeImpl();
		Arme a = daoArmeImpl.findById(h.getArme().getId());
		h.setArme(a);
		
		return h;
	}

	@Override
	public List<Hobbit> findAll() {
		// TODO Auto-generated method stub
		AOHobbitImpl daoHobbitImpl = new DAOHobbitImpl();
		return daoHobbitImpl.findAll();
	}

	@Override
	public void update(Hobbit entity) {
		// TODO Auto-generated method stub
		DAOArmeImpl daoArmeImpl = new DAOArmeImpl();
		daoArmeImpl.update(entity.getArme());
		
		DAOHobbitImpl daoHobbitImpl = new DAOHobbitImpl();
		daoHobbitImpl.update(entity);
	}
	
}
