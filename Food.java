package classesArr;

public class Food {

	private int code;
	private String name;
	private String[] ingridients;
	private int ingridientscounter;
	private final int maxingridients = 15;
	
	public Food(int code, String name) {
		this.code = code;
		this.name = name;
		this.ingridients = new String[15];
		this.ingridientscounter = 0;		
	}
	
	public Food (Food other) {
		this.code = other.code;
		this.name = other.name;
		this.ingridients = new String[other.ingridients.length];
		for(int i = 0; i < other.ingridients.length; i++) {
			this.ingridients[i] = other.ingridients[i];
		}
	}
	
	public int getcode() {
		return this.code;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String[] getingridients() {
		return this.ingridients;
	}
	
	public int getingridientscounter() {
		return this.ingridientscounter;
	}
	
	public void setcode(int code) {
		this.code = code;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public boolean addingridient(String ingridient) {
		if (ingridientscounter < maxingridients) {
			ingridients[ingridientscounter] = ingridient;
			ingridientscounter++;
			return true;
		}
		return false;		
	}
	
	public String toString() {
		return this.name + " " + this.code + " " + this.ingridients;
	}
}

















