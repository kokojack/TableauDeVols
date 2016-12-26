package compoAeroport;

public class Copilote extends Personne 
{
	private String nom;
	private String prenom;
	private final String fonction = "copilote";
	
	public Copilote(String nom, String prenom) throws InvariantBroken 
	{
		super (nom, prenom);
		
	}

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
