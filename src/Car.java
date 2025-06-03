
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x,y,30,30);
		frame.fillOval(x+50,y,30,30);
		frame.fillRect(x-20,y-50,120,50);
		frame.fillRect(x+20,y-80,40,50);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}

}
