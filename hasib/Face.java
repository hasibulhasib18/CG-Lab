package h1;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Face extends JFrame
{

	public Face()
	{
		setTitle("FaceDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(250, 200, 350, 350);
		//g.setColor(Color.YELLOW)
		//g.dOval(250,200,350,350);
		

		
		g.setColor(Color.black);
		g.fillOval(350,290,40,10);
		
		g.setColor(Color.black);
		g.fillOval(460,290,40,10);
		
		g.setColor(Color.black);
		g.fillRect(355,460,150,8);
		
		



		
	
		
	}
	public static void main(String[] args) 
	{
		Face f = new Face();
	}

}

