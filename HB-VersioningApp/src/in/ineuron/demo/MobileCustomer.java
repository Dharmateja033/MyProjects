package in.ineuron.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class MobileCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cno;
	private String cname;
	private Long mobno;
	private String callertune;
	
	
	@Version
	private Integer versionCount;
	

	@Override
	public String toString() {
		return "MobileCustomer [cno=" + cno + ", cname=" + cname + ", mobno=" + mobno + ", callertune=" + callertune
				+ ", versionCount=" + versionCount + "]";
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getMobno() {
		return mobno;
	}

	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}

	public String getCallertune() {
		return callertune;
	}

	public void setCallertune(String callertune) {
		this.callertune = callertune;
	}

}
