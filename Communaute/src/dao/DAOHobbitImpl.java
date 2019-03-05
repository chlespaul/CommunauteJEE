package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Hobbit;

public class DAOHobbitImpl implements DAOHobbit{

	@Override
	public void delete(Hobbit entity) {
		
		// TODO Auto-generated method stub
	}

	@Override
	public void insert(Hobbit entity) {
		// TODO Auto-generated method stub
		insertQuery("INSERT INTO `HOBBIT` (`NOM`, `RACE`, `DESCRIPTION`, `ARME`) VALUES ('" + entity.getNom() +"', '"+entity.getRace()+"','"+ entity.getDescription()+"','"+entity.getArme().getNom()+"');");
	}

	@Override
	public Hobbit findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hobbit> findAll() {
		List<Hobbit> l = new ArrayList<>();
		ResultSet rs = query("SELECT * FROM HOBBIT");
		try {
			while(rs.next()){
				String nom = rs.getString("NOM");
				String race = rs.getString("RACE");
				String description = rs.getString("DESCRIPTION");
				Hobbit h = new Hobbit();
				h.setNom(nom);
				h.setRace(race);
				System.out.println("nom: " + nom);
				l.add(h);
			}
		} catch(Exception e){}
		return l;
	}

	@Override
	public void update(Hobbit entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hobbit findByName(String a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean insertQuery(String q){
		System.out.println(q);
		Connection c = ConnexionBD.getConexion();
		PreparedStatement ps = null;
		try{
			ps = c.prepareStatement(q);
			return ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	private ResultSet query(String q){
		Connection c = ConnexionBD.getConexion();
		Statement smtm = null;
		ResultSet rs = null;
		try {
			smtm = c.createStatement();
			rs = smtm.executeQuery(q);
		} catch(Exception e){
			e.printStackTrace();
		}
		return rs;
	}

}
