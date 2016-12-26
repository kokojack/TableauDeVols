package compoAeroport;

public class PNC extends Personne{
	
	private String nom;
	private String prenom;
	private final String fonction = "pnc";
	
	public PNC (String nom, String prenom) throws InvariantBroken 
	{
		super (nom, prenom);
	}

	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
