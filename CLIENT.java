package S_R_B_A;

import java.util.ArrayList;
import java.util.List;

public class CLIENT 
{
	private String Nume;
	private String Username;
	private String Parola;
	
	public List<REZERVARE> Rezervari = new ArrayList<REZERVARE>();

	public void LogIn()
	{
		
	}
	
	public void LogOut()
	{
		
	}
	
	@SuppressWarnings("hiding")
	public <CLIENT> Object Autentificare() 
	{
		return null;
	}
	
	@SuppressWarnings("hiding")
	public <REZERVARE> Object A_Bilet() 
	{
		return null;
	}
	
	public void  R_Bilet()
	{
		
	}

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) 
	{
		Nume = nume;
	}

	public String getUsername() 
	{
		return Username;
	}

	public void setUsername(String username) 
	{
		Username = username;
	}

	public String getParola() 
	{
		return Parola;
	}

	public void setParola(String parola) 
	{
		Parola = parola;
	}
}
