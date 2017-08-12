package polimorphism1;

public class Cake {
	String ingredients1;
	String ingredient2;
	String ingredients3;
	String ingredients4;

	public String recipe(String ingredients1, String ingredient2) {
		String total = ingredients1 + ingredient2;
		System.out.println(ingredients1 + " " + ingredient2);
		return total;
	}

	public String recipe(String ingredients1, String ingredient2, String ingredients3) {
		String total = ingredients1 + ingredient2 + ingredients3;
		System.out.println(ingredients1 + " " + ingredient2 + " " + ingredients3);
		return total;
	}

	public String recipe(String ingredients1, String ingredient2, String ingredients3, String ingredients4) {
		String total = ingredients1 + ingredient2 + ingredients3 + ingredients4;
		System.out.println(ingredients1 + " " + ingredient2 + " " + ingredients3 + " " + ingredients4);
		return total;
	}
}
