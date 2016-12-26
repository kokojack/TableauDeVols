package compoAeroport;

import java.util.Date;

public class Vol implements CompleteEquipage {
	
	private String num;
	private String dest;
	private String site;
	private Avion av;
	private Date dep;
	
	public Vol (String num, String dest, String site, Avion av, Date dep)
	{
		this.num = num;
		this.site = site;
		this.dest = dest;
		this.av = av;
		this.dep = dep;
	}
	
	public Vol (String num, Date dep)
	{
		this.num = num;
		this.dep = dep;
	}

	public void addPilote(Pilote p) throws EquipageException
	{
		
	}
	public void addCoPilote(Copilote C) throws EquipageException
	{
		
	}
	public void addPNC(PNC p) throws EquipageException
	{
		
	}
	public boolean equipageAuComplet()
	{
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
