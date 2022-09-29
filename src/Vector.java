import java.util.Arrays;
import java.util.Random;

public class Vector {
	int size;
	final String INFO;
	int[] parameters1;
	int[] parameters2;

	public Vector(int size) {
		this.size = size;
		this.parameters1 = new int[size];
		this.parameters2 = new int[size];
		this.INFO = "This is a vector in " + size + "D";
	}

	public void vectorInit() {
		for (int i = 0; i < this.parameters1.length; i++) {
			this.parameters1[i] = new Random().nextInt(10);
			this.parameters2[i] = new Random().nextInt(10);
		}
	}

	public void vectorInfo() {
		System.out.println(this.INFO);
		System.out.print(Arrays.toString(parameters1) + Arrays.toString(parameters2) + "\n");
	}

	public double vectorLength() {
		int[] x = new int[parameters1.length];
		int y = 0;
		for (int i = 0; i < parameters1.length; i++) {
			x[i] = this.parameters1[i] - this.parameters2[i];
			y += x[i] * x[i];
		}
		return Math.sqrt(y);
	}

	public Vector vectorAdd(Vector vector) {
		int[] x = new int[parameters1.length];
		for (int i = 0; i < parameters1.length; i++) {
			x[i] = vector.parameters1[i] - this.parameters2[i];
		}
		for (int i = 0; i < x.length; i++) {
			vector.parameters1[i] = this.parameters1[i];
			vector.parameters2[i] -= x[i];
		}
		return vector;
	}

	public Vector vectorSubstract(Vector vector) {
		int[] x = new int[parameters1.length];
		for (int i = 0; i < parameters1.length; i++) {
			x[i] = vector.parameters1[i] - this.parameters1[i];
		}
		for (int i = 0; i < x.length; i++) {
			vector.parameters1[i] = vector.parameters2[i] - x[i];
			vector.parameters2[i] = this.parameters2[i];
		}
		return vector;
	}

	public double vectorScalar(Vector vector) {
		int[] x = new int[parameters1.length];
		double value = 0;
		for (int i = 0; i < parameters1.length; i++) {
			x[i] = vector.parameters1[i] - this.parameters1[i];
		}
		for (int i = 0; i < x.length; i++) {
			value += this.parameters2[i] * (vector.parameters2[i] - x[i]);
		}
		return value;
	}

	public static Vector[] vectorGeneration(int size, int quantity) {
		Vector[] vect = new Vector[quantity];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = new Vector(size);
		}
		for (int j = 0; j < vect.length; j++) {
			for (int i = 0; i < size; i++) {
				vect[j].parameters1[i] = new Random().nextInt(10);
				vect[j].parameters2[i] = new Random().nextInt(10);
			}
		}
		return vect;
	}

}
