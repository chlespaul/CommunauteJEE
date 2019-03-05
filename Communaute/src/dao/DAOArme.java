package dao;

import bean.Arme;

public interface DAOArme extends Dao<Arme> {
	
	public Arme findByName(String a);

}
