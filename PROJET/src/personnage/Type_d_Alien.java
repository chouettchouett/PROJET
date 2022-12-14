package personnage;

public enum Type_d_Alien {REINE("reine"),INFANTERIE("infanterie"),GARDE_PRETORIENNE("Garde_pretorienne");
	private String nom;
	
	private Type_d_Alien(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return(nom);
	}

}
