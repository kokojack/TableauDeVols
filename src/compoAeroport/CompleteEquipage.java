package compoAeroport;

public interface CompleteEquipage {

	public void addPilote(Pilote p) throws EquipageException;
	public void addCoPilote(Copilote C) throws EquipageException;
	public void addPNC(PNC p) throws EquipageException;
}
