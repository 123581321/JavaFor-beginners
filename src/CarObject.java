
public class CarObject extends MyFrame{
	public void run() {
		Car car1 = new Car(100,100,1,0);
		Car car2 = new Car(100,200,2,0);
		Car car3 = new Car(100,300,3,0);
		Car car4 = new Car(100,400,4,0);
		Car car5 = new Car(100,500,5,0);
		for(int i = 0;i<100;i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car3.draw(this);
			car4.draw(this);
			car5.draw(this);
			car1.move();
			car2.move();
			car3.move();
			car4.move();
			car5.move();
			sleep(0.1);
		}
	}

}
