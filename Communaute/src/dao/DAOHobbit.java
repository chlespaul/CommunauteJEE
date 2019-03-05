package dao;

import bean.Hobbit;

public interface DAOHobbit extends Dao<Hobbit> {
	
	public Hobbit findByName(String a);

}
