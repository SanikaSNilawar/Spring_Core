package in.sp.beans;

public class Address {
	 private int h_no;
	  private String cityname;
	  private int pincode;
	  
	  public Address(int h_no ,String cityname, int pincode){
		  this.h_no=h_no;
		  this.cityname=cityname;
		  this.pincode=pincode;
	  }
@Override
public String toString() {
	return h_no + " "+ cityname +" "+pincode;
}
}
