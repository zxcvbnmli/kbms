package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * tb_dataBack数据备份表
 * @author lenovo
 *
 */
public class DataBack {
	private Integer backId;//备份id
	private String backName;//备份文件名
	private Date createdate;//备份时间
	private String filePath;//文件路径
	private String Remarks;//备主
	public Integer getBackId() {
		return backId;
	}
	public void setBackId(Integer backId) {
		this.backId = backId;
	}
	public String getBackName() {
		return backName;
	}
	public void setBackName(String backName) {
		this.backName = backName;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
}
