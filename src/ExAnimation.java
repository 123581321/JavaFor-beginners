
public class ExAnimation extends MyFrame{
	public void run() {
		int i = 0;
		int x = 100;
		int y = 100;
		while(true) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,100,100);
			if(i<10) {
				x+=10;
			}
			else if(i<20) {
				y+=10;
			}
			else if(i<30) {
				x-=10;
			}
			else if(i<40) {
				y-=10;
			}
            i++;
            if(i==40) {
				i = 0;
			}
            sleep(0.1);
		}
	}

}
