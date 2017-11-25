abstract class Shape{
	abstract void draw();
	abstract int area();
	abstract void display();
}

class Rectangle extends Shape{
	int length, breadth;
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void draw(){
		System.out.println("Rectangle draw...");
	}
	
	int area(){
		return length*breadth;
	}
	
	void display(){
		System.out.println("Area of Rectangle: "+area());
	}
}

class TestShape{
	public static void main(String[] args){
		Rectangle r = new Rectangle(10,20);
		r.draw();
		r.area();
		r.display();
	}
}
