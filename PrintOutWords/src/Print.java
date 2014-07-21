import javax.swing.JOptionPane;

public class Print
{
	public static void main(String[] args)
	{
		name();
		System.out.println("dumdeedumdeedum");
		doingThis();
	}

	public static void name()
	{
		int integer = 536493;
		int jar = 545099851;
		int answer = 0;
		String aString = " hello.... Hello?..... HELLO!?";
		boolean hhhhh = true;
		answer = jar + integer;
		if (hhhhh)
		{
			for (int i = 0; i < 500; i++)
			{
				System.out.println(answer + aString + " " + i);
			}
		}
	}

	public static void doingThis()
	{
		int thisOne = 6;
		int thisOtherOne = 78;
		int namedInt = 1;
		double added = 0;
		added = thisOne + thisOtherOne + namedInt;
		System.out.println(added);
		JOptionPane.showMessageDialog(null, "If I only had a brain.");
		String canniputor = JOptionPane
				.showInputDialog("Can I eat your brain?");
		System.out.println(canniputor);
		if (canniputor.equals("Not now."))
		{
			JOptionPane.showMessageDialog(null, "When?");
		}
		if (canniputor.equals("No"))
		{
			JOptionPane.showMessageDialog(null, ":'(");
		}
		if (canniputor.equals("I don't have one."))
		{
			JOptionPane.showMessageDialog(null, "HAHAHAHAHAHAHAHAHAHA!");
		}
	}
}