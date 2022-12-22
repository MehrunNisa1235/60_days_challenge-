interface animal
{
	public abstract void moves();
}

interface bird
{
	void fly();
}

public class Interface_demo implements animal, bird
{
	public void moves()
	{
		System.out.println("Animals move on land");
	}

	public void fly()
	{
		System.out.println("Birds fly in air");
	}

	public static void main(String args[])
	{
		Interface_demo i=new Interface_demo();
		i.moves();
		i.fly();
	}
}
