package exercises;

public class Character {
	private String name;
	private String species;
	
	public Character(String name, String species) {
		this.name = name;
		this.species = species;
		
	}
	
	@Override
	public String toString() {
		return "Name: " + name +",  Species: " + species;
		
	}
	
	public static void main(String[] args) {
		Character bilbo = new Character("Bilbo", "Hobbit");
		Character legolas = new Character("Legolas", "Elf");
				
		System.out.println(bilbo);
		System.out.println(legolas);
	}

}
