package fourthwork;

public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "
				+myCircle.getRadius() + " is " + myCircle.gerArea());
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
				+myCircle.getRadius() + " is " + myCircle.gerArea());
		System.out.println("The number of objects created is "
				+ CircleWithPrivareDataFields.getNumberOfObjects());
	}
}
