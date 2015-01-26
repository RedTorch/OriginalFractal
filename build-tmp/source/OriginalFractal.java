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

public class OriginalFractal extends PApplet {

float myMagnitude = 1.1f;
public void setup()
{
	//whatever here
	size(600,600);
	rectMode(CENTER);
	noFill();
	//fill(100,100,200,50);
	stroke(150,150,250);
	noLoop();
}
public void draw()
{
	background(0);
	myMagnitude = 2;
	squares(120,300,1,20);
}
public void squares(int x, int y, int direction, int dimensions)
{
	//whatever here
	if(dimensions>800)
	{
		direction=6;
	}
	if(direction==5)
	{
		direction-=4;
	}
	if(direction==1)
	{
		rect(x+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), dimensions, dimensions);
		squares(x+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction+1, (int)(dimensions*myMagnitude));
		squares(x+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction, (int)(dimensions*myMagnitude));
	}
	else if(direction==2)
	{
		rect(x+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), dimensions, dimensions);
		squares(x+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction+1, (int)(dimensions*myMagnitude));
		squares(x+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction, (int)(dimensions*myMagnitude));
	}
	else if(direction==3)
	{
		rect(x-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), dimensions, dimensions);
		squares(x-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction+1, (int)(dimensions*myMagnitude));
		squares(x-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y+(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction, (int)(dimensions*myMagnitude));
	}
	else if(direction==4)
	{
		rect(x-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), dimensions, dimensions);
		squares(x-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction+1, (int)(dimensions*myMagnitude));
		squares(x-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)),y-(int)(dimensions/myMagnitude+dimensions/(myMagnitude*myMagnitude)), direction, (int)(dimensions*myMagnitude));
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
