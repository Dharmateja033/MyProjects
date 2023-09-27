package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class PgmProjectID implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@GenericGenerator(name = "g1", strategy = "in.ineuron.CustomGenerator.SID_Gen")
//	@GeneratedValue(generator = "g1")
//	
	private Integer pid;

	private Integer projId;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	@Override
	public String toString() {
		return "PgmProjectinfo [pid=" + pid + ", projId=" + projId + "]";
	}

}
