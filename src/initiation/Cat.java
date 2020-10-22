package initiation;

public class Cat {

	private String name = "Inconnu";
	private String color;
	private int age = 0;

	/**
	 * Constructeur
	 * 
	 * @param name
	 * @param color
	 * @param age
	 */
	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Cat(String color) {
		this.color = color;
		this.name= "Chat "+this.color;//Nom par defaut
	}

	/**
	 * Définir un autre nom Mutateur (setter en Anglais)
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Renvoie le nom du chat
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void show() {
		System.out.println("Chat nommé " + this.name + " de couleur " + this.color);
		System.out.println(this.name + " a " + this.age + " ans");
	}

	public void listen() {
		System.out.println("RRRRRRrrrrrrrr");
	}
	
}
