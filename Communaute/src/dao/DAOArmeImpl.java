package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Arme;

public class DAOArmeImpl implements DAOArme{

	@Override
	public void delete(Arme entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Arme entity) {
		// TODO Auto-generated method stub
		insertQuery("INSERT INTO `ARME` (`ID`, `NOM`, `MATERIAU`) VALUES ('" + entity.getId() +"','" + entity.getNom() +"', '"+entity.getMateriau()+"');");
	}

	@Override
	public Arme findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arme> findAll() {
		List<Arme> l = new ArrayList<>();
		ResultSet rs = query("SELECT * FROM ARME");
		try {
			while(rs.next()){
				String id = rs.getId("ID");
				String nom = rs.getString("NOM");
				String materiau = rs.getString("MATERIAU");
				Arme a = new Arme();
				a.setNom(nom);
				a.setMateriau(materiau);
				System.out.println("nom: " + nom);
				l.add(a);
			}
		} catch(Exception e){}
		return l;
	}

	@Override
	public void update(Arme entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Arme findByName(String a) {
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
		System.out.println(q);
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
