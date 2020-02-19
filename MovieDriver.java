import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String ans = "y";
		String title;
		String rating;
		int soldTickets;
		Movie mov;
		
		
	while (ans.equals("y")) {
			System.out.println("Enter the name of a movie: ");
			title = input.nextLine();
			
			System.out.println("Enter the rating of the movie: ");
			rating = input.nextLine();
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			soldTickets = input.nextInt();
			
			mov = new Movie(title, rating, soldTickets);
			System.out.println(mov); //calls toString
			System.out.println("Movie: " +  mov.getTitle() + " Rating: " + mov.getRating() + " Tickets sold: " + mov.getSoldTickets() );
			
			input.nextLine();
			
			System.out.println("Do you wish to continue? (y or n)");
			ans = input.nextLine();
	}
		
		input.close();
		
		System.out.println("Goodbye");
		

	}

}
