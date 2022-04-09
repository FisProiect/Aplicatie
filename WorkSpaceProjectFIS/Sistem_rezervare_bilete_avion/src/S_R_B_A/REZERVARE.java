package S_R_B_A;

import java.util.ArrayList;
import java.util.List;

public class REZERVARE 
{
	public List<ZBOR> Zboruri = new ArrayList<ZBOR>();
	public boolean Plata;
	
	public REZERVARE(List<ZBOR> zboruri, boolean plata)
	{
		super();
		Zboruri = zboruri;
		Plata = plata;
	}
	
	public float Calc_Disc() 
	{
		return 0;
	}
	
	public void Eliberare_Bilet()
	{
		
	}
	
	public boolean Plata() 
	{
		return false;
	}
	
	@SuppressWarnings("unused")
	private static void DISCOUNT( )
    {
        System.out.println("Discount method.");
    }
	
	@SuppressWarnings("unused")
	private static void BILET( )
    {
        System.out.println("Ticket method.");
    }
}