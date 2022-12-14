package personnage;

public class Joueur extends Personnage {
	private String prenom;
	  private String son_histoire;
	  private int age;
	  private int sexe; // avec 0 homme, femme 1 et peut-être plus avec hybride
	  private String classe; // metier , sous groupe de classe -> pouvoir
	  private int argent;
	  private int point_de_mana;
	  private String particularite; // pas forcéments lié à la classes , des noms de capacité qui font des chiffres -> eclair ->
	  private String divers; // info en plus , en texte , truc bonus qu'on interagit pas avec ~ l 
	  private int diverse; // info en plus , int , truc bonus qu'on interagit pas avec ~ l  indice de recherche, corruption
	  
	  // dans feuille combat -> localisation
	  
	  // background 
	  
	  public String getPrenom() {
		  return prenom;
	  }

	  public String getSon_histoire() {
		  return son_histoire;
	  }

	  public int getAge() {
		  return age;
	  }

	  public int getSexe() {
		  return sexe;
	  }

	  public String getClasse() {
		  return classe;
	  }

	  public int getArgent() {
		  return argent;
	  }

	  public int getPoint_de_mana() {
		  return point_de_mana;
	  }

	  public String getParticularite() {
		  return particularite;
	  }

	  public String getDivers() {
		  return divers;
	  }

	  public int getDiverse() {
		  return diverse;
	  }
	
	public Joueur(String nom,  String son_apparence, String equipement, String carac,
  			String competence, int point_de_vie, String race, String classe,
  			
  			String prenom, String son_histoire, int age, int sexe, int argent,
  			int point_de_mana, String particularite, String divers, int diverse ) {
		
		super(nom, son_apparence, equipement, carac, competence, point_de_vie, race, classe);
		
		this.prenom = prenom;
		this.son_histoire = son_histoire;
		this.age = age;
		this.sexe = sexe;
		this.argent = argent;
		this.point_de_mana = point_de_mana;
		this.particularite = particularite; 
		this.divers = divers;
		this.diverse = diverse;
	}

	public void presentation() {
		  parler(" Bonjour, je m'appelle " + getNom() +" "+ prenom + "\n Mon histoire : " + son_histoire + "\n je ressemble à "
				  + getSon_apparence() + "\n j'ai " + age + " ans \n mon numero de sexe est : " + sexe + "\n je suis de race : " + getRace() + "\n de classe : " +
				  classe + "\n mon equipement : " + getEquipement() + "\n j'ai " + argent + " argent \n " + getPoint_de_vie() + " pt de vie \n "
				  + point_de_mana + " pt de mana" + "\n mes particularite : " + particularite + "\n mes caracteristiques : " + getCarac() +
				  "\n mes competences :" + getCompetence()  + "\n des faits divers :"+ divers + " \n des points divers: " + diverse);
	  }
	 
}
