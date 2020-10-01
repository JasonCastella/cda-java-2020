package tamagotchi;

public class MainScriptCat {

	public static void main(String[] args) {
		System.out.println("Hello");
		Cat myCat = new Cat("Java", "Gris", 11);
		myCat.show();
		Cat yourCat = new Cat("Francis", "Roux", 2);
		yourCat.show();
		Cat otherCat = new Cat("Roux");
		otherCat.show();
		otherCat.setName("Patapouf");
		otherCat.show();

		System.out.println("Chat 1 : " + myCat.getName() + myCat.getColor() + myCat.getAge());
		System.out.println("Chat 2 : " + yourCat.getName());
		System.out.println("Chat 3 : " + otherCat.getName());

		myCat.listen();
	}

}
