
public class Car extends Vehicle{
	
	
	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {
		frame.fillOval(x,y,30,30);
		frame.fillOval(x+50,y,30,30);
		frame.fillRect(x-20,y-50,120,50);
		frame.fillRect(x+20,y-80,40,50);
	}
	

}
