package h1;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Flag2 extends JFrame
{

	public Flag2()
	{
		setTitle("Flag");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{

		

		 g.setColor(Color.cyan);
		  g.fillRect(50,100, 350,100);
		  g.setColor(Color.white);
		  g.fillRect(50,200, 350,100);
		  g.setColor(Color.cyan);
		  g.fillRect(50,300, 350,100);
		
		



		
	
		
	}
	public static void main(String[] args) 
	{
		Flag2 f = new Flag2();
	}

}

