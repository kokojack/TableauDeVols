package compoAeroport;

public class Personne {
	
	private String nom;
	private String prenom;
	private TypeAvion[] ope;
	
	public Personne (String nom, String prenom) throws InvariantBroken 
	{
		this.nom = nom;
		this.prenom = prenom;
		ope = new TypeAvion [2];
	}
	
	public String getNom()
	{
		return nom;
	}
	public String getPrenom()
	{
		return prenom;
	}
	public boolean peutAjouter()
	{
		if (ope[1] != null || ope[2] != null)
			return false;
		return true;
	}
	public boolean peutSupprimer()
	{
		if (ope[1] != null || ope[2] != null)
			return true;
		return false;
	}
	public boolean peutVoler(TypeAvion t)
	{
		for (TypeAvion ta : ope)
		{
			if (ta.getNom() == t.getNom() && ta.getMax() == t.getMax() && ta.getMin() == t.getMin())
				return true;
		}
		return false;
	}
	public boolean addQualification(TypeAvion t) throws EquipageException, InvariantBroken
	{
		if (peutAjouter())
		{
			if (ope[1] == null)
				ope[1] = t;
			ope[2] = t;
			t.addQualifie(this);
			return true;
		}
		else
		{
			System.out.println("This person has two Qualifications");
			return false;
		}
	}
	public boolean delQualification (TypeAvion t, boolean fromType) throws EquipageException
	{
		if (peutSupprimer())
		{
			for(int i=1; i < 2; i++)
			{
				if (ope[i].compare(t))
				{
					ope[i] = null;
					t.delQualifie(this);
					return true;
				}
			}
			System.out.println("The person "+this.nom+" can't fly with this kind of airplane");
		}
		else
		{
			System.out.println("This person don't has any qualification");
			return false;
		}
		
		return false;
	}
	public boolean compare(Personne p)
	{
		if (this.getNom() == p.getNom() && this.getPrenom() == p.getPrenom())
			return true;
		return false;
	}

}
