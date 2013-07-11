
public class drawrectangle {
	

	String star = "*";
	String dots = ".";
	
	
	
	public String drawLength(int length,String character) {
		
		String horizontal = "";
		
		for (int i = 0; i <length; i++){
			horizontal = horizontal + character;
		}
		horizontal = horizontal + "\n";
		//System.out.println(horizontal);
		
		return horizontal;
	}

	public String drawSegment(int length, String character) {
		String segment = "";
		segment = segment + character;
		for (int i = 0; i<length-2; i++){
			segment = segment + " ";
		}
		segment = segment + character+"\n";
		//System.out.println(segment);
		return segment;
	}

	public String drawWidth(int length, int width, String character) {
		String vertical = "";
		for (int i = 0; i<width; i++){
			vertical = vertical + drawSegment(length, character);
		}
		//System.out.println(vertical);
		return vertical;

		
		
	}


	public String drawShape(int length, int width, String character) {
		String shape = "";
		
		shape = shape + drawLength(length, character);
		shape = shape + drawWidth(length, width, character);
		shape = shape + drawLength(length, character);
		
		System.out.println(shape);
		return shape;
		
	}
	
	
}
