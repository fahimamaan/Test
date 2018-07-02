package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	List<Observer> observer= new ArrayList<>();
	private float temp;
	private float pressure;
	
	
	@Override
	public void registerObserver(Observer ob) {
		//System.out.println(ob.getClass());
		observer.add(ob);
		System.out.println(observer);
	}
	@Override
	public void removeObserver(Observer ob) {
		// TODO Auto-generated method stub
		observer.remove(ob);
	}
	@Override
	public void notifyObserver() {
		
		observer.forEach(ob-> ob.update(this.temp,this.pressure));
	}
	
	public void notifyOb() {
		notifyObserver();
	}
	
	public void setMeasurement(float temp,float pre) {
		//System.out.println(observer);
		this.temp=temp;
		this.pressure=pre;
		notifyOb();
	}

}
