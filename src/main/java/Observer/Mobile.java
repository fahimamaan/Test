package Observer;

public class Mobile implements Observer {
       WeatherData display;
	public Mobile(WeatherData display) {
		this.display=display;
		display.registerObserver(this);
	}
	@Override
	public void update(float temp, float pre) {
		
		System.out.println("value in Mobile::::todays temp is "+temp+ ": & Pressure is"+pre);
	}

}
