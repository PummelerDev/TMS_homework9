import java.util.Random;

public class Vector2D {
	final String INFO = "This is a vector in 2D";
	int x1;
	int y1;
	int x2;
	int y2;

	public Vector2D(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double vectorLength() {
		double x = this.x1 - this.x2;
		double y = this.y1 - this.y2;
		return Math.sqrt(x * x + y * y);
	}

	public Vector2D vectorAdd(Vector2D vector) {
		int x = vector.x1 - this.x2;
		int y = vector.y1 - this.y2;
		Vector2D vect = new Vector2D(this.x1, this.y1, vector.x2 - x, vector.y2 - y);
		return vect;
	}

	public Vector2D vectorSubtract(Vector2D vector) {
		int x = vector.x1 - this.x1;
		int y = vector.y1 - this.y1;
		Vector2D vect = new Vector2D(vector.x2 - x, vector.y2 - y, this.x2, this.y2);
		return vect;
	}

	public double vectorScalar(Vector2D vector) {
		int x = vector.x1 - this.x1;
		int y = vector.y1 - this.y1;
		return this.x2 * (vector.x2 - x) + this.y2 * (vector.y2 - y);
	}

	public void vectorInfo() {
		System.out.println(this.INFO);
		System.out.println("(" + x1 + ", " + y1 + ") (" + x2 + ", " + y2 + ")");
	}

	public static Vector2D[] vectorGeneration(int quantity) {
		Vector2D[] vect = new Vector2D[quantity];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = new Vector2D(new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10),
					new Random().nextInt(10));
		}
		return vect;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector2D other = (Vector2D) obj;
		if (x1 != other.x1)
			return false;
		if (x2 != other.x2)
			return false;
		if (y1 != other.y1)
			return false;
		if (y2 != other.y2)
			return false;
		return true;
	}

}
