package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * tb_systemLog系统日志表
 * @author lenovo
 *
 */
public class SystemLog {
	private Integer logId;//日志id
	private String userName;//用户名
	private Date operateDate;//操作时间
	private String operation;//操作
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getOperateDate() {
		return operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
