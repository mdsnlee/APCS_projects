public class Circle {

	public static void main(String[] args) {
		System.out.println("please input a number: ");

        double radius = TextIO.getlnDouble();

        System.out.println("The circumference is " + circumference(radius));
        System.out.println("The area is " + area(radius));

        //System.out.prinln("the circumference is " + circumference(radius) + " and the radius is " + area(radius));
	}

    public static double circumference(double radius) {
		return radius * Math.PI * 2;
	}
	
	public static double area(double radius) {
		return radius * radius * Math.PI;
	}
}