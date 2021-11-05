package exercises;

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}
	
	@Override
	public String toString() {
		
		return ("My name is " + name);
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		
		// 2. Get the Cat to print it's name

		// 3. Kill the Cat!
		
		Cat garfield = new Cat("Garfield");
		
		garfield.meow();
		garfield.printName();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		garfield.kill();
		
		System.out.println(garfield);

	}
}



