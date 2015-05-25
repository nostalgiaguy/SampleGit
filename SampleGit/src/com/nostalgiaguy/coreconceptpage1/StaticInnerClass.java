package com.nostalgiaguy.coreconceptpage1;

public class StaticInnerClass {

	public static void main(String[] args) {
		double[] num = new double[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = 100 * Math.random();
		}
		ArAlgo.P p = ArAlgo.min_max(num);
		System.out.println("min = " + p.getF());
		System.out.println("max = " + p.getS());
	}
}

class ArAlgo {

	/**
	 * A pair of floating-point numbers
	 */
	public static class P {
		/**
		 * Constructs a pair from two floating-point numbers
		 */
		private double f;
		private double s;

		public P(double a, double b) {
			f = a;
			s = b;
		}
		/**
		 * Returns the first number of the pair
		 */
		public double getF() {
			return f;
		}
		/**
		 * Returns the second number of the pair
		 */
		public double getS() {
			return s;
		}
	}

	/**
	 * Computes both the minimum and the maximum of an array
	 */
	public static P min_max(double[] vals) {

		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for (double v : vals) {
			if (min > v) {
				min = v;
			}
			if (max < v) {
				max = v;
			}
		}
		return new P(min, max);
	}
}
