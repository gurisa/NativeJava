public class operator {
	public static void main(String[] args) {
		byte x = 3;
		byte y = 4;

		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		System.out.println("X + Y = " + (x+y));
		System.out.println("X - Y = " + (x-y));
		System.out.println("X X Y = " + (x*y));
		System.out.println("X / Y = " + (x/y));
		System.out.println("X % Y = " + (x%y));

		x++; y--;
	
		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		System.out.println("X += 1" + (x += 1));
		System.out.println("X -= 1" + (x -= 1));
		System.out.println("X *= 1" + (x *= 1));
		System.out.println("X /= 1" + (x /= 1));
		System.out.println("X %= 1" + (x %= 1));

		System.out.println("X == Y " + ((x == y) ? "true" : "false"));

	}

}