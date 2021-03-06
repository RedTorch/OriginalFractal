float myMagnitude = 1.1;
void setup()
{
	//whatever here
	size(600,600);
	rectMode(CENTER);
	noFill();
	//fill(100,100,200,50);
	stroke(150,150,250);
	noLoop();
}
void draw()
{
	background(0);
	myMagnitude = 2;
	squares(120,300,1,20);
}
void squares(int x, int y, int direction, int dimensions)
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