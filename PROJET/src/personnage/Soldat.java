package personnage;

public class Soldat extends Personnage{
	
	public Soldat(String nom,  String son_apparence, String equipement, String carac,
  			String competence, int point_de_vie, String race, String classe) {
		
		super(nom, son_apparence, equipement, carac, competence, point_de_vie, "Humain", classe);
		
	}

}
