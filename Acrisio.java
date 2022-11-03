package tecProg;
import robocode.*;
import java.awt.Color;


public class Acrisio extends AdvancedRobot {

	
	public void run() {
		setColors(Color.red, Color.red, Color.red);
		setScanColor(Color.red);


		while (true) {
				ahead(150);
			turnLeft(45);
			turnGunRight(180);
			
		}
		
}

public void onScannedRobot(ScannedRobotEvent e) {
      
		System.out.println(this.getName() + " - " + e.getDistance());
		if (e.getDistance() < 200) {
			fire(3);
		} else {
			fire(2);
			back(60);
		}
	}
	
public void onHitWall1(HitWallEvent event) {
back(200);
}
	
public void onHitRobot(HitRobotEvent evento){
turnRight(20);
fire(3);
back(30);
execute();

}

	
	}