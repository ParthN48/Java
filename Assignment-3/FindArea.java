abstract class Shape{
	abstract void area();
}

class Triangle extends Shape{
	double hight,base;
	Triangle(double hight,double base)
	{
		this.hight = hight;
		this.base = base;
	}
	void area()
	{	
		System.out.println("Area of Tringle is: " + 0.5 * hight * base);
	}
}

class Rectangle extends Shape{
	double width,length;
	Rectangle(double width,double length)
	{
		this.width = width;
		this.length = length;
	}
	void area()
	{	
		System.out.println("Area of Rectangle is: " + length * width);
	}
}
class Circle extends Shape{
	double raduis;
	Circle(double raduis)
	{
		this.raduis = raduis;
	}
	void area()
	{	
		System.out.println("Area of Circle is: " + 3.14 * raduis * raduis);
	}
}

class FindArea{
	public static void main(String args[]){
		int choice = Integer.parseInt(args[0]);
		switch (choice){
			case 1 : double hight = Double.parseDouble(args[1]);
					 double base = Double.parseDouble(args[2]);
					 Triangle t = new Triangle(hight,base);
					 t.area();
					 break;

			case 2 : double width = Double.parseDouble(args[1]);
					 double length = Double.parseDouble(args[2]);
					 Rectangle r = new Rectangle(width,length);
					 r.area();
					 break;

			case 3 : double raduis = Double.parseDouble(args[1]);
					 Circle c = new Circle(raduis);
					 c.area();
					 break;

			default : System.out.println("Invalid Input");
					  break;		 		 		 	
		}
	}
}