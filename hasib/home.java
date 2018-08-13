package h1;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class home extends JFrame
{

	public home()
	{
		setTitle("home");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		
		
		g.setColor(Color.black);
		g.drawLine(100, 250, 400, 250);
		g.setColor(Color.black);
		g.drawLine(100, 250, 250, 100);
		g.setColor(Color.black);
		g.drawLine(250, 100, 400, 250);
		g.setColor(Color.BLACK);
		g.drawLine(120, 250, 120, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 500, 370, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(370, 500,370, 250);
		
		
	    g.setColor(Color.black);
	    g.drawRect(220,350,60,150);
	
	    g.setColor(Color.black);
	    g.drawRect(150,300,50,50);
	    
	    g.setColor(Color.black);
	    g.drawRect(300,300,50,50);
		
	    g.setColor(Color.BLACK);
		g.drawLine(550, 450,550, 140);
		
		g.setColor(Color.BLACK);
		g.drawLine(565, 450,565, 140);
		
		g.setColor(Color.BLACK);
		g.drawOval(518, 110,80, 50);
			

		g.setColor(Color.black);
		g.drawLine(60, 150, 90, 30);


		
	
		
	}
	public static void main(String[] args) 
	{
		home f = new home();
	}

}