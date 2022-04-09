package S_R_B_A;

public class AVION 
{
	private Tip_Avion Tip;
	private int Num_Loc_Clasa1;
	private int Num_Loc_Clasa2;
	
	public AVION(Tip_Avion tip, int num_Loc_Clasa1, int num_Loc_Clasa2) 
	{
		super();
		
		setTip(tip);
		setNum_Loc_Clasa1(num_Loc_Clasa1);
		setNum_Loc_Clasa2(num_Loc_Clasa2);
	}

	public Tip_Avion getTip() 
	{
		return Tip;
	}

	public void setTip(Tip_Avion tip) 
	{
		Tip = tip;
	}

	public int getNum_Loc_Clasa1() 
	{
		return Num_Loc_Clasa1;
	}

	public void setNum_Loc_Clasa1(int num_Loc_Clasa1) 
	{
		Num_Loc_Clasa1 = num_Loc_Clasa1;
	}

	public int getNum_Loc_Clasa2() 
	{
		return Num_Loc_Clasa2;
	}

	public void setNum_Loc_Clasa2(int num_Loc_Clasa2) 
	{
		Num_Loc_Clasa2 = num_Loc_Clasa2;
	}
}