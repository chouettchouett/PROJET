package personnage;

public enum Arme {ARME_A_FEU("Arme_a_feu"),ARME_BLANCHE("Arme_blanche"),EXPLOSIF("explosif");
	private String nom;
	
	private Arme(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return(nom);
	}

}
