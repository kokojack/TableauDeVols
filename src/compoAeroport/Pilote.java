package compoAeroport;

public class Pilote extends Personne 
{
	private String nom;
	private String prenom;
	private final String fonction = "pilote";
	
	public Pilote(String nom, String prenom) throws InvariantBroken 
	{
		super (nom, prenom);
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
