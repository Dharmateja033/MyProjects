package in.ineuron.demo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accNo;
	private String cname;
	private Long balance;
	private String type;
	@CreationTimestamp
	private LocalDateTime createdTime;
	@UpdateTimestamp
	private LocalDateTime updatedTime;
	
	
	@Version
	private Integer versionCount;
	
	public Integer getVersionCount() {
		return versionCount;
	}


	public void setVersionCount(Integer versionCount) {
		this.versionCount = versionCount;
	}


	static {
		System.out.println("BankAccount.class file loading....");
	}
	public BankAccount() {
		System.out.println("BankAccount object is instantiated....");
	}


	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}


	public Long getBalance() {
		return balance;
	}


	public void setBalance(Long balance) {
		this.balance = balance;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public LocalDateTime getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}


	public LocalDateTime getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(LocalDateTime updatedTime) {
		this.updatedTime = updatedTime;
	}


	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", cname=" + cname + ", balance=" + balance + ", type=" + type
				+ ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", versionCount=" + versionCount
				+ "]";
	}
	

	
}