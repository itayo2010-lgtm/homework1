package classesArr;

public class Menu {

	private String menuname;
	private final int maxdishes = 22;
	private Food [] foodarr;
	private int dishescounter;
	
	public Menu(String menuname) {
		this.foodarr = new Food[maxdishes];
		this.dishescounter = 0;
	}
	
	public boolean adddish(Food newdish) {
		if (dishescounter < maxdishes) {
			foodarr[dishescounter] = newdish;
			dishescounter++;
			return true;
		}
		return false;
	}
	
	public Food[] getdishes() {
		return this.foodarr;
	}
	
	public String getmenuname() {
		return this.menuname;
	}
	
	public void setmenuname(String menuname) {
		this.menuname = menuname;
	}
	
	public String toString() {
		return this.menuname + " " + this.foodarr;
	}
	
	public void disheswithoutmissingingridient(String f) {
		for (int i = 0; i < dishescounter; i++) {
			boolean hasf = false;
			for (int j = 0; j < foodarr[i].getingridientscounter(); j++) {
				if(foodarr[i].getingridients()[j].equals(f)) {
					hasf = true;
				}
			}
			if (!hasf) {
				System.out.println(foodarr[i].getcode());
			}
		}
	}
}









