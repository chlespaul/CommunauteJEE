package bean;

public abstract class Personnage {

	String nom;
	String race;
	Arme arme;
	String description;
	
	public Personnage() {
		
	}
	
	public Personnage(String nom){
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public Arme getArme() {
		return arme;
	}
	public void setArme(Arme arme) {
		this.arme = arme;
	}
	
	public abstract String getDescription();

	public void setDescription(String description) {
		this.description = description;
	}
	
}
