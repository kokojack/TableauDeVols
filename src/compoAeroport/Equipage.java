package compoAeroport;

public abstract class Equipage implements CompleteEquipage {
	
	private Vol v;
	
	public Equipage(Vol v)
	{
		this.v = v;
	}

	public void addPilote(Pilote p) throws EquipageException
	{
		
	}

	@Override
	public void addCoPilote(Copilote C) throws EquipageException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPNC(PNC p) throws EquipageException {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
