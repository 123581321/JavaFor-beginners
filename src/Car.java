import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
	
	
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			vx=+5;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			vy=-5;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			vy=+5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		vx =0;
		vy =0;
	}
	

}
