package testsuites.LearningJava;

public class break_return_continue {
    public static void main(String[] args) {
		int out, in = 0;
		nghiem: for (out = 0; out < 15; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break nghiem;
			}
			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
		}
		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);

    }
}
