package outil;

import java.util.HashMap;
import java.util.Map;

import bean.Personnage;

public class Factory {
	
	Map<String, String> map = new HashMap<>();
	
	private static Factory instance = null;
	
	private Factory(){
		map.put("Elfe", "bean.Elfe");
		map.put("Nain", "bean.Nain");
		map.put("Hobbit", "bean.Hobbit");
	}
	
	public static Factory getInstance(){
		return (instance!=null)? instance: new Factory();
	}
	
	public static void main(String[] args){
		Factory f = Factory.getInstance();
		
		System.out.println(f);
		Personnage p = f.getClass("Elfe");
		System.out.println(p);
	}
	
	public Personnage getClass(String race){
		Personnage p =null;
		String cl = map.get(race);
		try {
			Class newCl = Class.forName(cl);
			p = (Personnage) newCl.newInstance();
		} catch(Exception e){
			
		}
		return p;
	}

}
