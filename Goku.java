package dbztankz;
import robocode.*;
import java.awt.Color;

 public class Goku extends AdvancedRobot
{

//Tank de tiro Forte = João Victor

  public void mtfacil(){
  turnRight(36000);    
   System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿ \n ⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⠎⠄⠄⣀⡀⠄⠄⠄⠄⠄⠄⠄⠘⠋⠉⠉⠉⠉⠭⠿⣿ \n ⡀⠄⠄⠄⠄⠄⠄⠄⠄⡇⠄⣠⣾⣳⠁⠄⠄⢺⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ \n ⣿⣷⡦⠄⠄⠄⠄⠄⢠⠃⢰⣿⣯⣿⡁⢔⡒⣶⣯⡄⢀⢄⡄⠄⠄⠄⠄⠄⣀⣤⣶ \n ⠓⠄⠄⠄⠄⠄⠸⠄⢀⣤⢘⣿⣿⣷⣷⣿⠛⣾⣿⣿⣆⠾⣷⠄⠄⠄⠄⢀⣀⣼⣿ \n ⠄⠄⠄⠄⠄⠄⠄⠑⢘⣿⢰⡟⣿⣿⣷⣫⣭⣿⣾⣿⣿⣴⠏⠄⠄⢀⣺⣿⣿⣿⣿ \n ⣿⣿⣿⣿⣷⠶⠄⠄⠄⠹⣮⣹⡘⠛⠿⣫⣾⣿⣿⣿⡇⠑⢤⣶⣿⣿⣿⣿⣿⣿⣿ \n ⣿⣿⣿⣯⣤⣤⣤⣤⣀⣀⡹⣿⣿⣷⣯⣽⣿⣿⡿⣋⣴⡀⠈⣿⣿⣿⣿⣿⣿⣿⣿ \n ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣝⡻⢿⣿⡿⠋⡒⣾⣿⣧⢰⢿⣿⣿⣿⣿⣿⣿⣿ \n ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⣏⣟⣼⢋⡾⣿⣿⣿⣘⣔⠙⠿⠿⠿⣿⣿⣿ \n        Meu compromisso é sempre VENCER!");
     System.out.println(getName()+"WINS!");             
       

}

               public void kamehameha(double Kaioken) { 
	            double Masenko=getHeading()+Kaioken-getGunHeading();
	             if (!(Masenko > -180 && Masenko <= 180)) {
	              while (Masenko <= -180) {
			       Masenko += 360;
}
	        	    while (Masenko > 180) {
			         Masenko -= 360;
		}
	}
	                  turnGunRight(Masenko);
}

                    	public void run() {
                         setScanColor(Color.yellow);
                          setBulletColor(Color.red);
                           setBodyColor(Color.red);
                            System.out.println("Oi! Eu sou o "+getName()); //O tank se aprensenta no battle log
  
                        	 while(true){
    
                              setMaxVelocity(4);
                                ahead(100);
			                     turnGunRight(360);
			                      back(100);
			                       turnGunRight(360);
                                    if(getEnergy()<15){	 //Estrutura condicional para caso o tank estiver com menos de 15 de energia, ele diminuir a potência de dispartos e assim evitar de ficar desabilitado.
                                     setFire(1);

								 }

//Testes de movimentação q eu tava fazendo
/*    ahead(90);
    turnGunRight(360);
	turnGunLeft(360);
	back(40);
------------------   
turnGunRight(360);   
    ahead(100); 
    turnGunRight(360);   
    back(90);  
   */
  
}
	}
	                                           public void onScannedRobot(ScannedRobotEvent scan) {
    
                                                    kamehameha(scan.getBearing());
                                                     fire(3);
                                                      ahead(90);
	                                                   back(80);
	                                                    System.out.println("KAMEHAMEHA!");

	}
                                                        	public void onHitByBullet(HitByBulletEvent rj) {
		                                             
                                            System.out.println("MALDITO!!!!");
		                                back(60);	
	}
                                	public void onHitWall(HitWallEvent parede) {
                                 turnLeft(30);
		                     back(20);
	}	
	
                         public void onWin(WinEvent e) {
	                   mtfacil();

}
} //FIM DO CÓDIGO


