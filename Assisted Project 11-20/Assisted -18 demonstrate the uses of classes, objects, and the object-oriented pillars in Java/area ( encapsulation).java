

public class area {

	public  int calculate(int a ,int b){   			//to return sum
		return a+b;
	}
	public  int  calculate(float radius){	 		//to return area of circle 
		int a=(int)(3.14*radius*radius);
		return a;
	}
	public int   calculate(float l, float b){   	 //to return area of rectangle 
		//System.out.println(l*b);
		int x=(int)l*(int)b;
		return x;
	}
	public int calculate(int side){		 			  //to return square
		return side*side;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area ob=new area();
		System.out.println("Area of circle "+ob.calculate(10.01F));
		System.out.println("Sum  "+ob.calculate(10,20));
		System.out.println("Area of rectange "+ob.calculate(10.2F,20.2F));
		System.out.println("Area of square "+ob.calculate(10));
	}

}
