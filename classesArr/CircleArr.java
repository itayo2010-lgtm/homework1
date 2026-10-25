package classesArr;

public class CircleArr {

	private Circle [] CircleArr;
	private int circleCounter;
	private final int maxCircles = 50;
	
	public CircleArr() {
		this.CircleArr = new Circle[maxCircles];
		this.circleCounter = 0;
	}
	
	public boolean addCir(Circle other) {
		if (circleCounter == maxCircles) {
			return false;
		}
		CircleArr[circleCounter] = other;
		circleCounter++;
		return true;
	}
	
	public boolean removeCir(Circle other) {
		
		int index = -1;
		
		for(int i = 0; i < circleCounter; i++) {
			if(CircleArr[i] != null && CircleArr[i].isEqual(other)) {
				index = i;
				i = circleCounter++;
			}
		}
		
		if (index == -1)
			return false;
		
		for (int i = 0; i < circleCounter - 1; i++) {
			CircleArr[i] = CircleArr[i + 1];
		}
		
		CircleArr[circleCounter - 1] = null;
		circleCounter --;
		
		return true;
	}
	
}






