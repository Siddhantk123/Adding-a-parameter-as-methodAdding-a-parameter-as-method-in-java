class Box{
	double w; double h; double d;
	void volume(){
		System.out.print("Volume is");
		System.out.println(w*h*d);
	}
}
class BoxDemo{
	public static void main(String args[]){
		Box mybox1 =  new Box();
		mybox1.w = Integer.parseInt(args[0]);
		mybox1.h = Integer.parseInt(args[1]);
		mybox1.d = Integer.parseInt(args[2]);
		mybox1.volume(); //display  volume of box
	}
}


//Another program

import java.util.Scanner;//java library for user input
class Box{
	double w; double h; double d;
	double volume(){
		return (w*h*d);
	}
	void SetDim(double width,double height,double depth){
		w=width;
		h=height;
		d=depth;
	}
}
class BoxDemo{
	public static void main(String args[]){
		Box mybox =  new Box();
		double vol;
		Scanner ob=new  Scanner(System.in);//Second method for user input
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		mybox.SetDim(a,b,c);
		vol=mybox.volume();
		System.out.println("Volume is : "+vol);
	}
}
