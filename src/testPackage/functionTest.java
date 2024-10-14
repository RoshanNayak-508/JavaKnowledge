package testPackage;

public class functionTest {
	
	static int a=10;
	int b=15;
		void show() {
			System.out.println("This is show method "  +a +b);
		}

		static void display() {
			System.out.println("This is display method" +a );
		}

	public static void main(String[] args) {
		functionTest.display();
		functionTest ax = new functionTest();
		ax.show();
		display();
		ax.display();
		// functionTest.show();
		
		System.out.println(a);
		System.out.println(ax.b);
	}

}
