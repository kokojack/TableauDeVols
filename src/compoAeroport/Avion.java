package compoAeroport;

public class Avion {
	
	private TypeAvion tav;
	private String ref;
	
	public Avion (TypeAvion tav, String ref)
	{
		this.tav = tav;
		this.ref = ref;
	}
	
	public String getRef()
	{
		return ref;
	}
	
	public TypeAvion getType()
	{
		return tav;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
