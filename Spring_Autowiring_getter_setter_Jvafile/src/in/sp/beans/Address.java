package in.sp.beans;

public class Address {
  private int h_no;
  private String cityname;
  private int pincode;
  public int getH_no() {
	return h_no;
}
  public String getCityname() {
	return cityname;
  }
  public int getPincode() {
	return pincode;
  }
  
  public void setH_no(int h_no) {
	this.h_no = h_no;
  }
  public void setCityname(String cityname) {
	this.cityname = cityname;
  }
  public void setPincode(int pincode) {
	this.pincode = pincode;
	
	//no need to create getter method for dependency injection
  }
    @Override
    public String toString() {
    	return h_no +" " + cityname + pincode ;
    }
    
}
