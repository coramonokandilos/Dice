import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die one;
Die two;

public void setup()
{
	noLoop();
	size(400, 400);
	one = new Die(100, 150);
	two = new Die(250, 150);
}
public void draw()
{
	background(0);
	one.show();
	two.show();
	one.roll();
	two.roll();
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int numberOfDots, myX, myY;
	Die(int x, int y) //constructor
	{
		roll();
		myX = x;
		myY = y;
	}
	public void roll()
	{
		numberOfDots = (int)((Math.random()*6)+1);
	}
	public void show()
	{
		fill(255);
		rect(myX, myY, 75, 75);
		if (numberOfDots == 1)
		{
			ellipse(myX + 37, myY + 37, 10, 10);
		}
		else if (numberOfDots == 2)
		{
			ellipse(myX + 25, myY + 25, 10, 10);
			ellipse(myX + 45, myY + 45, 10, 10);
		}
		else if (numberOfDots == 3)
		{
			ellipse(myX + 15, myY + 15, 10, 10);
			ellipse(myX +35, myY + 35, 10, 10);
			ellipse(myX +55, myY + 55, 10, 10);
		}
		else if (numberOfDots == 4)
		{
			ellipse(myX +15, myY + 15, 10, 10);
			ellipse(myX +65, myY + 65, 10, 10);
			ellipse(myX +15, myY + 65, 10, 10);
			ellipse(myX +65, myY + 15, 10, 10);
		}
		else if (numberOfDots == 5)
		{
			ellipse(myX +15, myY + 15, 10, 10);
			ellipse(myX +65, myY + 65, 10, 10);
			ellipse(myX +37, myY + 37, 10, 10);
			ellipse(myX +15, myY + 65, 10, 10);
			ellipse(myX +65, myY + 15, 10, 10);
		}
		else
		{
			ellipse(myX +15, myY + 15, 10, 10);
			ellipse(myX +65, myY + 65, 10, 10);
			ellipse(myX +15, myY + 37, 10, 10);
			ellipse(myX +15, myY + 65, 10, 10);
			ellipse(myX +65, myY + 15, 10, 10);
			ellipse(myX +65, myY + 37, 10, 10);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
