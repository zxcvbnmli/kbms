package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * tb_userGroup用户组表
 * @author lenovo
 *
 */
public class UserGroup {
	private Integer userGroupId;//用户组id
	private String userGroupName;//用户组名称
	private String detail;//说明
	private Date createDate;//创建时间
	public Integer getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getUserGroupName() {
		return userGroupName;
	}
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
