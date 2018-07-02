package Observer;

public class MainObserver {

	
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		TvDisplay tv= new TvDisplay(data);
		Mobile mobile= new Mobile(data);
		
		data.setMeasurement(12, 14);
		data.setMeasurement(121, 11);
		data.setMeasurement(6,23);
	}
}
