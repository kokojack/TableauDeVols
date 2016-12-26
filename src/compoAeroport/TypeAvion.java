package compoAeroport;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.type.ArrayType;

public class TypeAvion {
	
	private String nom;
	private int max;
	private int min;
	private ArrayList<Personne> nbPnc;
	
	public TypeAvion (String nom, int max, int min)
	{
		this.nom = nom;
		this.max = max;
		this.min = min;
		nbPnc = new ArrayList(max);
	}
	
	public TypeAvion (String nom)
	{
		this.nom = nom;
		this.max = 6;
		this.min = 2;
		nbPnc = new ArrayList(max);
	}

	private boolean peutAjouter()
	{
		if (nbPnc.size() > max)
			return true;
		return false;
	}
	private boolean peutSupprimer()
	{
		if (nbPnc.size()> min)
			return true;
		return false;
					
	}
	public void addQualifie(Personne m) throws EquipageException, InvariantBroken
	{
		if (peutAjouter())
		{
			nbPnc.add(m);
			m.addQualification(this);
		}
			
	}
	public void delQualifie(Personne m) throws EquipageException
	{
		if (peutSupprimer())
		{
			for (Personne p : nbPnc)
			{
				if (p.compare(m))
				{
					nbPnc.remove(p);
					p.delQualification(this, true);
				}
					
			}
		}
	}
	public void purgeQualifies(Personne m) throws EquipageException, InvariantBroken
	{
//		for (Personne p : nbPnc)
//		{
//			nbPnc.remove(p);
//			p.delQualification(this, true);
//		}
	}
	public String getNom() 
	{
		return nom;
	}

	public int getMax() 
	{
		return max;
	}
	
	public int getMin() 
	{
		return min;
	}

	public boolean compare (TypeAvion t)
	{
		if (this.getNom() == t.getNom() && this.getMax() == t.getMax() && this.getMin() == t.getMin())
			return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
