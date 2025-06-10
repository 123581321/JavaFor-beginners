
public class Truck extends Vehicle {

	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame f) {
		f.fillRect(x+75,y,25,25);
		f.fillRect(x,y+25,100,25);
		f.fillOval(x+5,y+50,15,15);
		f.fillOval(x+20,y+50,15,15);
		f.fillOval(x+75,y+50,15,15);
		
	}

   
}

