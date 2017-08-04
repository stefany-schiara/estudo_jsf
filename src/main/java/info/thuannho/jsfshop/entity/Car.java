package info.thuannho.jsfshop.entity;

public class Car {
	
	private String RandomId;
	private String RandomBrand;
	private Integer RandomYear; 
	private String RandomColor; 
	private Integer RandomPrice; 
	private Boolean RandomSoldState;
	
	public Car() {
		super();
	}
	
	public Car(String RandomId, String RandomBrand, Integer RandomYear, String RandomColor, Integer RandomPrice, Boolean RandomSoldState) {
		this.RandomId = RandomId;
		this.RandomBrand = RandomBrand;
		this.RandomYear = RandomYear;
		this.RandomColor = RandomColor;
		this.RandomPrice = RandomPrice;
		this.RandomSoldState = RandomSoldState;		
		
	}
	
	public String getRandomId() {
		return RandomId;
	}
	
	public void setRandomId(String RandomId) {
		this.RandomId = RandomId;
	}
	
	public String getRandomBrand() {
		return RandomBrand;
	}
	
	public void setBrand(String RandomBrand) {
		this.RandomBrand = RandomBrand;
	}
	
	public Integer getRandomYear() {
		return RandomYear;
	}
	
	public void setRandomYear(Integer RandomYear) {
		this.RandomYear = RandomYear;
	}
	
	public String getRandomColor() {
		return RandomColor;
	}
	
	public void setRandomColor(String RandomColor) {
		this.RandomColor = RandomColor;
	}
	
	public Integer getRandomPrice() {
		return RandomPrice;
	}
	
	public void setRandomPrice(Integer RandomPrice) {
		this.RandomPrice = RandomPrice;
	}
	
	public boolean getRandomSoldState() {
		return RandomSoldState;
	}
	
	public void setRandomSoldState(boolean RandomSoldState) {
		this.RandomSoldState = RandomSoldState;
	}
	
	
	

}
