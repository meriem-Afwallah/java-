package projetPoecMyTube;

public class CommentaireOld {
	private int id;
	private String comment;
	private int like;
	private int dislike;
	private int commentCounter;
	public CommentaireOld(int id, String comment, int like, int dislike, int commentCounter) {
		super();
		this.id = id;
		this.comment = comment;
		this.like = like;
		this.dislike = dislike;
		this.commentCounter = commentCounter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getDislike() {
		return dislike;
	}
	public void setDislike(int dislike) {
		this.dislike = dislike;
	}
	public int getCommentCounter() {
		return commentCounter;
	}
	public void setCommentCounter(int commentCounter) {
		this.commentCounter = commentCounter;
	}
	

}
