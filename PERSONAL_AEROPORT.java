package S_R_B_A;

import java.util.ArrayList;
import java.util.List;

public class PERSONAL_AEROPORT 
{
	private String Nume;
	
	public List<CLIENT> Client = new ArrayList<CLIENT>();
	
	public void Verificare_Plata()
	{
		
	}
	
	public void Eliberare_Bilet()
	{
		
	}
	
	public boolean Acceptare_Plata_Numerar()
	{
		return false;
	}

	public String getNume() 
	{
		return Nume;
	}

	public void setNume(String nume) 
	{
		Nume = nume;
	}
	
	@SuppressWarnings("unused")
	private static void BILET( )
    {
        System.out.println("Ticket method.");
    }
}
