package dao;

import bean.Elfe;

public interface DAOElfe extends Dao<Elfe> {
	
	public Elfe findByName(String a);


}
