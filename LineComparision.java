package bridgelabz_assignment;

public class LineComparision {
	public static void LineComparision(){
		int x1 = 2, x2 = 8;
		int y1 = 4, y2 = 8;
		
		int xAxis1 = 1 , xAxis2 = 8;
		int yAxis1 = 4 , yAxis2 = 8;
		
		Double lineLength_1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		Double lineLength_2 = Math.sqrt((xAxis2-xAxis1)*(xAxis2-xAxis1)+(yAxis2-yAxis1)*(yAxis2-yAxis1));
		
		System.out.println("First Line Length is "+lineLength_1);
		System.out.println("Second Line Length is "+lineLength_2);
		
		System.out.println(lineLength_1.equals(lineLength_2));
		
		if (lineLength_1 > lineLength_2) {
			System.out.println("Linelength1 is less then " +lineLength_1);
		}else if (lineLength_1 < lineLength_2) {
			System.out.println("Linelength1 is greater then " +lineLength_2);
		}else {
			System.out.println("Both lines " + lineLength_1 + " are equal " + lineLength_2 );
		}
	}
	public static void main(String[] args) {
		LineComparision();
	}

}