package TRAVEL;

public class BUS 
{
	private int bno;
	private boolean ac;
	private int cap;
	
	BUS(int a,boolean b,int c)
	{
		this.bno = a;
		this.ac = b;
		this.cap = c;
	}
	
	public int get_bno()
	{
		return bno;
	}
	
	public boolean get_ac()
	{
		return ac;
	}
	
	public int get_cap()
	{
		return cap;
	}
	
	public void display()
	{
		System.out.println("------------");
		System.out.println("Bus no:"+bno);
		System.out.println("Ac:"+ac);
		System.out.println("capacity:"+cap);
	}
}
