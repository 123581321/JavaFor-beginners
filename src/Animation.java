
public class Animation extends MyFrame{
	public void run() {
		int x = 70;
		int y = 100;
		int i = 0;
		//while (x<=400) {
			//画面を消す
		//	clear();
			//四角形を表示する
		//	setColor(0,128,0);
			//fillRect(x,80,10,100);
		//	fillOval(x,280,50,50);
			//x+=20;
			//sleep(0.02);
			
		//}
		//while (x>= 30) {//永久に動かす
			//画面を消す
			//clear();
			//四角形を表示する
			//setColor(0,128,0);
			//fillRect(x,80,10,100);
			//fillOval(x,280,50,50);
			//x-=20;
			//if(x>200) { 
				//break;
			//}
			//sleep(0.02);
	//}
		//5の①
		/*while(i<=30) {
			clear();
			
			setColor(0,128,0);
			fillRect(x,y,10,100);
			if(i<=10) {
				y-=10;
			}
			else {
				x+=10;
			}
			i++;
			sleep(0.1);
		}*/
		//5の2 
	 /* while(i<=40) {
		  
		  clear();
		  setColor(0,128,0);
		  fillRect(x,y,10,100);
		  if(i<=10) {
			  x+=10;
			  y+=10;
		  }
		  else if(i<=20) {
			  x-=10;
			  
		  }
		  else if(i<=30) {
			  x+=10;
			  y-=10;
		  }
		  else if(i<=40) {
			  x-=10;
			  
		  }
		  i++;
		 sleep(0.1);
		  
	  }*/
		for(i = 0; i<3 ;i++) {
		     while(x<=200) {
		    	 clear();
		    	 setColor(0,128,0);
		    	 fillRect(x,y,10,100);
		    	 x+=5;
		    	 sleep(0.1);
		     }
		     while(x>=70) {
		    	 clear();
		    	 setColor(0,128,0);
		    	 fillRect(x,y,10,100);
		    	 x-=5;
		    	 sleep(0.1);
		     }
		}

	}}
