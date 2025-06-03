
public class DisplayFaceObject extends MyFrame {
	public void run() {
	/*	Face face1 = new Face();
		face1.x = 100;
		face1.y = 50;
		face1.draw(this);
		
		Face face2 = new Face();
		face2.x = 200;
		face2.y = 150;
		face2.draw(this);
	 */
		Face face1 = new Face(50,50,10,5);
		Face face2 = new Face(200,100,10,5);
		Face face3 = new Face(150,200,10,10);
		Tree tree1 = new Tree(200,100,-10,-5);
		
		for(int i = 0; i<100; i++) {
			clear();
			face1.draw(this);
			face2.draw(this);
			face3.draw(this);
			tree1.draw(this);
			face1.x += 10;
			face1.y -= 10;
			face2.x += 5;
			face2.y -= 5;
			face3.x += -10;
			face3.y -= +10;
			tree1.move();
			sleep(0.1);
		}
	}
	
}
