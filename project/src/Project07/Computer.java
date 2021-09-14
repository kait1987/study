package Project07;

public class Computer {
	
	private Cpu c;
	private Memory m1;
	private Power P;
	private Mainboard m;
	
	public Computer() {
		this.c = new Cpu();
		this.m1 = new Memory();
		this.P = new Power();
		this.m = new Mainboard();
				
	}
	

}
