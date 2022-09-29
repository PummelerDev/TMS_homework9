
public class Main {

	public static void main(String[] args) {
		Vector2D v1 = new Vector2D(0, 0, 0, 1);
		Vector2D v2 = new Vector2D(0, 0, 1, 0);
		Vector2D test = v1.vectorAdd(v2);
		Vector2D testSub = v1.vectorSubtract(v2);
		System.out.println(test.x1 + " " + test.y1 + " " + test.x2 + " " + test.y2);
		test.vectorInfo();
		System.out.println(test.vectorLength());
		System.out.println(testSub.x1 + " " + testSub.y1 + " " + testSub.x2 + " " + testSub.y2);
		testSub.vectorInfo();
		System.out.println(testSub.vectorLength());
		System.out.println(v1.vectorScalar(v2));
		v1.vectorInfo();

		Vector2D[] testArr = Vector2D.vectorGeneration(10);
		for (int i = 0; i < testArr.length; i++) {
			testArr[i].vectorInfo();
		}

		Vector3D[] testArr3D = Vector3D.vectorGeneration(10);
		for (int i = 0; i < testArr3D.length; i++) {
			testArr3D[i].vectorInfo();
		}

		Vector testVector = new Vector(3);
		testVector.vectorInit();
		testVector.vectorInfo();
		Vector testVector2 = new Vector(3);
		testVector2.vectorInit();
		testVector2.vectorInfo();
		Vector testtest = testVector.vectorAdd(testVector2);
		testtest.vectorInfo();
		System.out.println(testtest.vectorLength());

		Vector[] vector = Vector.vectorGeneration(10, 3);
		for (int i = 0; i < vector.length; i++) {
			vector[i].vectorInfo();
		}
		Vector vector1test = vector[0].vectorAdd(vector[1]);
		vector1test.vectorInfo();
		System.out.println(vector1test.vectorLength());
	}

}
