package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import bean.Hobbit;

public class ConnexionBD {
	
	private static Connection con = null;
	
	private static ConnexionBD c = null;
	
	private ConnexionBD(){
		System.out.println("construc conectionbd");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/user","user","user");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/user","user","user");
			DAOHobbitImpl dhi = new DAOHobbitImpl();
			List<Hobbit> l = dhi.findAll();
			for (Hobbit hobbit : l) {
				System.out.println("res nom: " + hobbit.getNom());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Le driver a pas marche");
			e.printStackTrace();
		}
	}
	
	public static Connection getConexion(){
		if(c == null){
			c = new ConnexionBD();
		}
		
		return con;
	}

}
