
public class Humidity implements Observer{

	private double humidity;
	
	public Humidity (Subject sub) {
		sub.registerObserver(this);
	}
	
	@Override
	public void update(double temp, double humidity, double pressure) {
		this.humidity = humidity;
		display();
	}
	
	public void display () {
		System.out.println( "Humidity is " + humidity);
	}

}
