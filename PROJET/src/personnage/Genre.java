package personnage;

public enum Genre {ALIEN("Alien"),CTHULU("Cthulu"),MEDIEVAL_FANTASTIQUE("Medieval_fantastique");
	private String nom;
	
	private Genre(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return(nom);
	}
}
