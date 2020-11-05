
public class Review {
	private String userId;
	private String recipeId;
	private String content;
	private int rating;
	
	public Review(String userId, String recipeId, String content, int rating) {
		this.userId = userId;
		this.recipeId = recipeId;
		this.content = content;
		this.rating = rating;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
