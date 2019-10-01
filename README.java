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
