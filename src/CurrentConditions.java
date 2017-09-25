
public class CurrentConditions implements Observer {
	
	private double temp;
	
	public CurrentConditions (Subject sub) {
		sub.registerObserver(this);
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temp = temp;
		display();
	}
	
	public void display () {
		System.out.println("Current temp is: " + temp);
	}

}
