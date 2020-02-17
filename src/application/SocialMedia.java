package application;

import java.text.ParseException;
import entities.Comment;
import entities.Post;

public class SocialMedia {

	public static void main(String[] args) throws ParseException {
		Comment comentOne = new Comment("Have a nice trip!");
		Comment comentTwo = new Comment("Wow! That's awesome!");
		
		Post postOne = new Post(Post.simpleDateFormat.parse("10/02/2020 20:30:45")
								, "Traveling to USA"
								, "I'm going to visit this wonderful contry!"
								, 12);
		
		postOne.addComments(comentOne);
		postOne.addComments(comentTwo);
		
		System.out.println(postOne);
		
		Comment comentThree = new Comment("Good night!");
		Comment comentFour = new Comment("May the Force be with you.");
		
		Post postTwo = new Post(Post.simpleDateFormat.parse("15/02/2020 22:11:34")
								, "Good night, guys"
								, "See you tomorrow"
								, 5);
		
		postTwo.addComments(comentThree);
		postTwo.addComments(comentFour);

		System.out.println(postTwo);
	}

}
