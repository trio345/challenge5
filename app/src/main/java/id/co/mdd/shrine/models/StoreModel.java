package id.co.mdd.shrine.models;

public class StoreModel {
	private String image;
	private long price;
	private String description;
	private int id;
	private String title;
	private String category;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setPrice(long price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}
}
