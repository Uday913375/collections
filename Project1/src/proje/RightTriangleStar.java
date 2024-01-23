package proje;

public class RightTriangleStar {

	// =========Right Triangle Star==============

	void m1() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
}
	void m5() {
	}
	// =========Right Triangle Numbers==============
	void m2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}

	}
	// =========left Triangle stars==============

	void m3() {
		for (int i = 0; i < 5; i++) {
			// inner loop work for space
			for (int j = 5 - i; j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints star
				System.out.print("*");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

	// ========= Pyramid Star==============

	void m4() {
		for (int i = 0; i < 5; i++) {
			// inner loop work for space
			for (int j = 5 - i; j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints star
				System.out.print("*  ");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightTriangleStar R = new RightTriangleStar();
		R.m1();
		R.m2();
		R.m3();
		R.m4();
	}
}
