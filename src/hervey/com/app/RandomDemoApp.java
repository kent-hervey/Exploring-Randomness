package hervey.com.app;

import java.util.Set;
import java.util.TreeSet;

public class RandomDemoApp {

	public static void main(String[] args) {

		double minValue = 1;
		double maxValue = 100;
		int numberDecimalPlaces = 4;
		int iterations = 100;

		quickRandomTester(minValue, maxValue, numberDecimalPlaces, iterations);
	}

	private static void quickRandomTester(double min, double max, int roundDecimalPlaces, int iterations) {
		Set<Double> treeSet = new TreeSet<Double>();
		double rounder = (double) Math.pow(10, roundDecimalPlaces);

		for (long i = 0; i < iterations; i++) {
			Double unroundedResult = (Math.random() * (max - min) + min);
			double roundedResult = (Math.round(unroundedResult * rounder)) / rounder;
			treeSet.add((Double) roundedResult);
		}
		System.out.printf("result of testing random two decimals between %s and %s\n", min, max);
		treeSet.forEach(System.out::println);
	}

}


