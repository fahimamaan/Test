package resources;

public class Message3 implements Runnable{
	Object monitor;
	String msg;
	public Message3(String msg) {
		this.msg=msg;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
