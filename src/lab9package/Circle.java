package lab9package;

import java.text.DecimalFormat;

public class Circle {
	private double radius = 0;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String formatNumber(double x) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(x);
	}

	public String getFormattedArea() {
		String formattedArea = formatNumber(getArea());
		return formattedArea;
	}

	public String getFormattedCircumference() {
		String formattedCircumference = formatNumber(getCircumference());
		return formattedCircumference;
	}

	public String getCompliment() {
		String compliment = "";
		if (radius > 5.0) {
			compliment = "\nBoy, that's some dingus!";
		}
		return compliment;
	}

	@Override
	public String toString() {
		return "Hoop Area = " + getFormattedArea() + "\n\nHoop Circumference = " + getFormattedCircumference();
	}

}
