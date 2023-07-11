package in.ineuron.hibernate;

import javax.persistence.*;
//import javax.persistence.Table;

@Entity
@Table(name="STDTAB")
public class Student {
	
	public Student() {
		System.out.println("Hibernate calls Student constructor");
	}
	@Id
	@Column(name="stdId")
    private int sid;
	@Column(name="stdName",length=20)
    private String sname;
	@Column(name="stdAddr",length=20)
    private String saddress;
	@Column(name="stdAge")
    private int age;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", age=" + age + "]";
	}

}
