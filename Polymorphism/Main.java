class Movie {
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}
	
	public String getName(){
		return name;
	}
}

class Jaws extends Movie {
	public Jaws() {
		super ("Jaws");
	}
	
	public String plot(){
		return "A shark eats lot of people";
	}
}

class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("IndependenceDay");
	}
	
	@Override 
	public String plot(){
		return "Aliens attempt to take over planet earth"; 
	}
}

class MazeRunner extends Movie {
	
	public MazeRunner(){
		super("Maze Runner");
	}
	@Override
	public String plot(){
		return "Kids try and escape a maze";
	}
}

class StarWars extends Movie {
	
	public StarWars(){
		super("Star Wars");
	}
	@Override
	public String plot(){
		return "Imperial Forces try to take over the universe";
	}
}

class Forgetable extends Movie {
	public Forgetable(){
		super("Forgetable");
	}
}


public class Main{
	
	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
																				"Plot: " + movie.plot() + "\n");
		}
	}
	
	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number was: " + randomNumber);
		
		switch(randomNumber) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				return new Forgetable();
		}
		return null; 
	}
}

/*
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class. // engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4 // and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

*/