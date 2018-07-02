package Observer;

public class TvDisplay implements Observer {

	private WeatherData display ;
	public TvDisplay(WeatherData display) {
		this.display=display;
		display.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float pre) {
		
		System.out.println("value in tvdisplay::::todays temp is "+temp+ ": & Pressure is"+pre);
	}

}
