package compoAeroport;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

public class CompoAirport implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2233753519272320192L;
	private static final String FILE_NAME = "Airport.srz";
	private SortedSet<Equipage> equipages = new TreeSet<>();
	private SortedSet<Vol> vols = new TreeSet<>();
	private boolean db = false;
	private String hability;
	
	private CompoAirport(boolean db)
	{
		/*
		 * faire un if pour lire dans la base de données ou non
		 */
	}
	public void setdb()
	{
		if (db)
			db = false;
		else
			db = true;
	}
	public CompoAirport(String hability)
	{
		this.hability = hability;
		if (hability == "administrator")
		{
			
		}
			
		if (hability == "manager")
		{
			
		}
		if (hability == "member")
		{
			
		}
	}

	
	/**
	 * Retourne les .
	 * 
	 * @return
	 */
	/**
	 * Retourne les .
	 * 
	 * @return
	 */	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
