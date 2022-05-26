package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	int eid;
	String name;
	int age;
	@JsonFormat(shape = Shape.STRING,pattern = "dd/MM/yyyy")
	private java.util.Date date;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<Address> address=new ArrayList<Address>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, int age, Date date, List<Address> address) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.date = date;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public List<Address> getA() {
		return address;
	}

	public void setA(List<Address> a) {
		this.address = a;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", date=" + date + ", address=" + address + "]";
	}
	
	

}
