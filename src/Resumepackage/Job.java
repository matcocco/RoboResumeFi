package Resumepackage;
import java.time.LocalDateTime;

public class Job {
	private String jtitle;
	private String ctitle;
	private LocalDateTime sdate;
	private LocalDateTime edate;
	private String jduties;
	
	public String getJtitle() {
		return jtitle;
	}
	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}
	public String getCtitle() {
		return ctitle;
	}
	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}
	public LocalDateTime getSdate() {
		return sdate;
	}
	public void setSdate(LocalDateTime sdate) {
		this.sdate = sdate;
	}
	public LocalDateTime getEdate() {
		return edate;
	}
	public void setEdate(LocalDateTime edate) {
		this.edate = edate;
	}
	public String getJduties() {
		return jduties;
	}
	public void setJduties(String jduties) {
		this.jduties = jduties;
	}
	
}
