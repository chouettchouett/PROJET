package personnage;

// import java.util.Random; // a voir

public class Personnage {
  private String nom;
  private String son_apparence;
  private String equipement; // avec arme, stuff, etc
  private String carac; // force, agi etc
  private int point_de_vie;
  private String competence; // corps a corps, natation ...
  private String race;
  private String classe;
  
  public Personnage(String nom,  String son_apparence, String equipement, String carac,
		  			String competence, int point_de_vie, String race, String classe) {
	  
	  this.nom = nom;
	  this.son_apparence = son_apparence;
	  this.equipement = equipement;
	  this.carac = carac;
	  this.competence = competence;
	  this.point_de_vie = point_de_vie;
	  this.race = race;
	  this.classe = classe;
  }
  

// liste de tous les getteurs
  public String getNom() {
	  return nom;
  }

  public String getSon_apparence() {
	  return son_apparence;
  }

  public String getRace() {
	  return race;
  }
  
  public String getClasse() {
	  return classe;
  }

  public String getEquipement() {
	  return equipement;
  }

  public int getPoint_de_vie() {
	  return point_de_vie;
  }

  public String getCarac() {
	  return carac;
  }

  public String getCompetence() {
	  return competence;
  }

  // fin getteurs
  
  protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
  
}
  