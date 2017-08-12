package polimorphism1;

public class MakeCake {

	public static void main(String[] args) {
		Cake mycake = new Cake();
		mycake.recipe("sugar", "egg");
		mycake.recipe("sugar","egg","chocolate");
		mycake.recipe("sugar", "egg", "chocolate", "banana");
	
	AnotherClassForPractice chcake  = new AnotherClassForPractice();
		chcake.recipe ("sugar", "egg");
	}	
	}

