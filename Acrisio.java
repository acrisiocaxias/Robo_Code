package tecProg;
import robocode.*;
import java.awt.Color;


public class Acrisio extends AdvancedRobot {

	
	public void run() {
		setColors(Color.red, Color.red, Color.red);
		setScanColor(Color.red);


		while (true) {
			ahead(220);
			back(160);
			turnLeft(38);
			turnGunRight(10);
			fire(3);
			
		}
		
}

public void onScannedRobot(ScannedRobotEvent e) {
fire(3);
		System.out.println(this.getName() + " - " + e.getDistance());
		turnLeft(45);

		if (e.getDistance() < 500) {
			fire(3);
		} else {
			fire(2);
			back(60);
		}
	}


	public void onHitWall1(HitWallEvent event) {
		back(80);
		ahead(30);
		turnLeft(35);
		
	}
public void onHitRobot(HitRobotEvent evento){
	
back(30);
ahead(50);
turnLeft(36);
}

	
	}