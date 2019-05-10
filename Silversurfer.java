package rek;
 
import robocode.*;
import java.awt.geom.Point2D;
 
public class Silversurfer extends AdvancedRobot {
    
	private EnemyBot enemy = new EnemyBot();
	

	public void run() {
		setAdjustRadarForRobotTurn(true);
        setAdjustGunForRobotTurn(true);
		enemy.reset();
		setTurnRadarRight(360);	
		while (true) {
			setTurnRadarRight(360);
			shooters();
			execute();
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        enemy.updateEnemyInfo(e);
    }
	
	public void shooters() {
		double turn = getHeading() - getGunHeading() + enemy.getBearing();
		setTurnGunRight(normalizeBearing(turn));
		double firePower = Math.min(500 / enemy.getDistance(), 3);
		if (getGunHeat() == 0 && Math.abs(getGunTurnRemaining()) < 8) {
			setFire(firePower);
		}
	}
	
double normalizeBearing(double angle) {
	while (angle >  180) angle -= 360;
	while (angle < -180) angle += 360;
	return angle;
}
	
}