package S_R_B_A;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ZBOR 
{
	private List<AVION> Lista = new ArrayList<AVION>();
	
	float Pret;
	
	private String Cod_Cursa;
	private String Aeroport_Plecare;
	private String Aeroport_Sosire;
	
	private Calendar Timp_Plecare;
	private Calendar Timp_Sosire;
	
	protected ZBOR(String cod_Cursa, List<AVION> lista, float pret, String aeroport_Plecare,
		String aeroport_Sosire, Calendar timp_Plecare, Calendar timp_Sosire) 
	{
		super();
		
		setCod_Cursa(cod_Cursa);
		setLista(lista);
		Pret = pret;
		setAeroport_Plecare(aeroport_Plecare);
		setAeroport_Sosire(aeroport_Sosire);
		setTimp_Plecare(timp_Plecare);
		setTimp_Sosire(timp_Sosire);
	}

	protected void Modificare_Zbor()
	{
		
	};
	
	protected void Stergere_Zbor()
	{
		
	};
	
	protected void Calc_Pret()
	{
		//error without void
		//alternative solution: type abstract
	}

	public List<AVION> getLista() 
	{
		return Lista;
	}

	public void setLista(List<AVION> lista) 
	{
		Lista = lista;
	}

	public String getCod_Cursa() 
	{
		return Cod_Cursa;
	}

	public void setCod_Cursa(String cod_Cursa) 
	{
		Cod_Cursa = cod_Cursa;
	}

	public String getAeroport_Plecare() 
	{
		return Aeroport_Plecare;
	}

	public void setAeroport_Plecare(String aeroport_Plecare) 
	{
		Aeroport_Plecare = aeroport_Plecare;
	}

	public String getAeroport_Sosire() 
	{
		return Aeroport_Sosire;
	}

	public void setAeroport_Sosire(String aeroport_Sosire) 
	{
		Aeroport_Sosire = aeroport_Sosire;
	}

	public Calendar getTimp_Plecare() 
	{
		return Timp_Plecare;
	}

	public void setTimp_Plecare(Calendar timp_Plecare) 
	{
		Timp_Plecare = timp_Plecare;
	}

	public Calendar getTimp_Sosire() 
	{
		return Timp_Sosire;
	}

	public void setTimp_Sosire(Calendar timp_Sosire) 
	{
		Timp_Sosire = timp_Sosire;
	};
	
	@SuppressWarnings("unused")
	private static void PRET( )
    {
        System.out.println("Price method.");
    }
}
