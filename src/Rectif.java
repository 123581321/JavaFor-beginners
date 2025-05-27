
public class Rectif extends MyFrame{
	public void run() {
		int x = 30;
		int y = 30;
		setColor(0,128,0);
		int i;//繰り返しに使う変数iを宣言
		//for(i = 0; i <10; i++){//i=0から、i<9の間繰り返す。
			                   //繰り返すたびにiを１増やす
		//	fillRect(x,x,10,40);
		//	x+=20;
		//	y+=10;
			
		//for	(i = 0; i<10; i++) {
			
	    // fillRect(x,30,10,y);
			
			//x+=20;
			//y+=10;
			
			
		//}
		//for	(i = 0; i<10; i++) {
			//setColor(i*10,i*10,i*10);
		   //  fillRect(30,30,10,30);
				
				
		
	//}
		for	(i = 0; i<20; i++) {
			if(i<10) {setColor(i*10,i*10,i*10);}
			else {setColor(i-10,i-10,i-10);}
		     fillRect(20 +i * 15,30,10,30);
			

}}}
