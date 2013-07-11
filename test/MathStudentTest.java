

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class MathStudentTest {
	
	

	@Test
	public void area(){
		MathStudent ar= new MathStudent();
		int expected= ar.area(5,4);
		assertEquals(20,expected);
	}
	
	@Test
	public void perimeter(){
		MathStudent par= new MathStudent();
		int perimeter= par.perimeter(5,4);
		assertEquals(18,perimeter);
		
	}
	@Test
	public void square(){
		MathStudent par= new MathStudent();
		MathStudent ar= new MathStudent();
		int sperimeter= par.sperimeter(5);
		int sarea= ar.sarea(5);
		assertEquals(25,sarea);
		assertEquals(20,sperimeter);
	
	}
	
	@Test
	public void DrawLengthStar(){
		drawrectangle dr= new drawrectangle();
		String sideLength = dr.drawLength(5, "*");
		assertEquals("*****\n",sideLength);
	}
	
	@Test
	public void DrawLengthDots(){
		drawrectangle dr= new drawrectangle();
		String sideLength = dr.drawLength(5, ".");
		assertEquals(".....\n",sideLength);
	}
	
	@Test
	public void DrawLengthHash(){
		drawrectangle dr= new drawrectangle();
		String sideLength = dr.drawLength(5, "8");
		assertEquals("88888\n",sideLength);
	}
	
	
	@Test
	public void DrawSegment(){
		drawrectangle dr= new drawrectangle();
		String segment = dr.drawSegment(5, "*");
		assertEquals("*   *\n",segment);
	}
	
	
	@Test
	public void DrawWidth(){
		drawrectangle dr= new drawrectangle();
		String sideWidth = dr.drawWidth(5, 3, "*");
		assertEquals("*   *\n*   *\n*   *\n",sideWidth);
	}
	@Test
	public void DrawShape (){
		drawrectangle dr = new drawrectangle();
		String shape = dr.drawShape(5,3, "*");
		assertEquals("*****\n*   *\n*   *\n*   *\n*****\n",shape);
		
		
		
	}
	@Test
	public void DrawShapeDollar (){
		drawrectangle dr = new drawrectangle();
		String shape = dr.drawShape(6,4, "$");
		assertEquals("$$$$$$\n$    $\n$    $\n$    $\n$    $\n$$$$$$\n",shape);
		
		
		
	}
	
	
	
	
}
		