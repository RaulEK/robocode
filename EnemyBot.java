package rek;
import robocode.*;

/**
 * MyClass - a class by (your name here)
 */
public class EnemyBot {
	
	private String name;
	private double bearing;
	private double distance;
	private double energy;
	private double heading;
	private double velocity;
	
	public String getName() {
		return this.name;
	}
	public double getBearing() {
		return this.bearing;
	}
	public double getDistance() {
		return this.distance;
	}
	public double getEnergy() {
		return this.energy;
	}
	public double getHeading() {
		return this.heading;
	}
	public double getVelocity() {
		return this.velocity;
	}
	
	public void updateEnemyInfo(ScannedRobotEvent event) {
		this.name = event.getName();
		this.bearing = event.getBearing();
		this.distance = event.getDistance();
		this.energy = event.getEnergy();
		this.heading = event.getHeading();
		this.velocity = event.getVelocity();
	}
	
	public void reset() {
		this.name = "";
		this.bearing = 0.0;
		this.distance = 0.0;
		this.energy = 0.0;
		this.heading = 0.0;
		this.velocity = 0.0;

	}
	
	public boolean none() {
		if (this.name.equals("")) {
			return true;
		}
		return false;
	}
	
	public EnemyBot() {
		reset();
	}
	
}