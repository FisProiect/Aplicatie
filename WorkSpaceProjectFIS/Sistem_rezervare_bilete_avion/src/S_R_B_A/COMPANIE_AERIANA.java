package S_R_B_A;

import java.util.Calendar;
import java.util.List;

public class COMPANIE_AERIANA extends ZBOR
{
	private String Nume;
	
	public COMPANIE_AERIANA(String cod_Cursa, List<AVION> lista, float pret, String aeroport_Plecare,
							String aeroport_Sosire, Calendar timp_Plecare, Calendar timp_Sosire, String nume) 
	{
		super(cod_Cursa, lista, pret, aeroport_Plecare, aeroport_Sosire, timp_Plecare, timp_Sosire);
		setNume(nume);
	}
	
	public void Modificare_Zbor()
	{
		
	};
	
	public void Stergere_Zbor()
	{
		
	}

	public String getNume() 
	{
		return Nume;
	}

	public void setNume(String nume) 
	{
		Nume = nume;
	};
}