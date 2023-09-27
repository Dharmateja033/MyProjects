package in.ineuron.model;

import java.io.Serializable;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PgmProjectInfo implements Serializable{
   
 
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PgmProjectID id;
	
	private String pname;
	private Integer deptno;
	private String projName;
	
	
	public PgmProjectID getId() {
		return id;
	}
	public void setId(PgmProjectID id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	
	@Override
	public String toString() {
		return "PgmProjectInfo [id=" + id + ", pname=" + pname + ", deptno=" + deptno + ", projName=" + projName + "]";
	}
	
}
