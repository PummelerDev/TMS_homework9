import java.util.Random;

public class Vector3D {
	final String INFO = "This is a vector in 3D";
	int x1;
	int y1;
	int x2;
	int y2;
	int z1;
	int z2;

	public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
		this.x1 = x1;
		this.y1 = y1;
		this.z1 = z1;
		this.x2 = x2;
		this.y2 = y2;
		this.z2 = z2;
	}

	public double vectorLength() {
		double x = this.x1 - this.x2;
		double y = this.y1 - this.y2;
		double z = this.z1 - this.z2;
		return Math.sqrt(x * x + y * y + z * z);
	}

	public Vector3D vectorAdd(Vector3D vector) {
		int x = vector.x1 - this.x2;
		int y = vector.y1 - this.y2;
		int z = vector.z1 - this.z2;
		Vector3D vect = new Vector3D(this.x1, this.y1, this.z1, vector.x2 - x, vector.y2 - y, vector.z2 - z);
		return vect;
	}

	public Vector3D vectorSubtract(Vector3D vector) {
		int x = vector.x1 - this.x1;
		int y = vector.y1 - this.y1;
		int z = vector.z1 - this.z1;
		Vector3D vect = new Vector3D(vector.x2 - x, vector.y2 - y, vector.z2 - z, this.x2, this.y2, this.z2);
		return vect;
	}

	public double vectorScalar(Vector3D vector) {
		int x = vector.x1 - this.x1;
		int y = vector.y1 - this.y1;
		int z = vector.z1 - this.z1;
		return this.x2 * (vector.x2 - x) + this.y2 * (vector.y2 - y) + this.z2 * (vector.z2 - z);
	}

	public void vectorInfo() {
		System.out.println(this.INFO);
		System.out.println("(" + x1 + ", " + y1 + ", " + z1 + ") (" + x2 + ", " + y2 + ", " + z2 + ")");
	}

	public static Vector3D[] vectorGeneration(int quantity) {
		Vector3D[] vect = new Vector3D[quantity];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = new Vector3D(new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10),
					new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10));
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
		Vector3D other = (Vector3D) obj;
		if (x1 != other.x1)
			return false;
		if (x2 != other.x2)
			return false;
		if (y1 != other.y1)
			return false;
		if (y2 != other.y2)
			return false;
		if (z1 != other.z1)
			return false;
		if (z2 != other.z2)
			return false;
		return true;
	}
}
