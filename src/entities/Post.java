package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void addComments(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComments(Comment comment) {
		this.comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.title + "\n");
		stringBuilder.append(this.likes);
		stringBuilder.append(" Likes - ");
		stringBuilder.append(Post.simpleDateFormat.format(this.moment) + "\n");
		stringBuilder.append(this.content + "\n\n");
		stringBuilder.append("Comments: \n");
		
		for(Comment comment : this.comments) {
			stringBuilder.append(comment.toString() + "\n");
		}
		
		return stringBuilder.toString();
	}
}
