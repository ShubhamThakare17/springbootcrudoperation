package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aid;
	String area;
	String city;
	String state;
	String postal;
	long pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int aid, String area, String city, String state, String postal, long pin) {
		super();
		this.aid = aid;
		this.area = area;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.pin = pin;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", area=" + area + ", city=" + city + ", state=" + state + ", postal=" + postal
				+ ", pin=" + pin + "]";
	}

}
