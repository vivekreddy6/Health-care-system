package healthcare.dto;

public class Diagnostic {
private int diacode;
private String centername;
private double centerId;
private String centerAddress;
private Long centercontact;

public Diagnostic() {super();}

public Diagnostic(int diacode, String centername, double centerId, String centerAddress, Long centercontact) {
	super();
	this.diacode = diacode;
	this.centername = centername;
	this.centerId = centerId;
	this.centerAddress = centerAddress;
	this.centercontact = centercontact;
}

public int getDiacode() {
	return diacode;
}


public void setDiacode(int diacode) {
	this.diacode = diacode;
}


public String getCentername() {
	return centername;
}


public void setCentername(String centername) {
	this.centername = centername;
}


public double getCenterId() {
	return centerId;
}


public void setCenterId(double centerId) {
	this.centerId = centerId;
}


public String getCenterAddress() {
	return centerAddress;
}


public void setCenterAddress(String centerAddress) {
	this.centerAddress = centerAddress;
}


public Long getCentercontact() {
	return centercontact;
}


public void setCentercontact(Long centercontact) {
	this.centercontact = centercontact;
}
}
