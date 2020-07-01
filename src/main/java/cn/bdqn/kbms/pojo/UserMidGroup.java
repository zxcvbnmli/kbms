package cn.bdqn.kbms.pojo;
/**
 * 
 * tb_userMidGroup用户用户组中间表
 * @author lenovo
 *
 */
public class UserMidGroup {
	private Integer userMGroupId;//主键id
	private Integer userId;//用户id
	private Integer userGroupId;//用户组id
	public Integer getUserMGroupId() {
		return userMGroupId;
	}
	public void setUserMGroupId(Integer userMGroupId) {
		this.userMGroupId = userMGroupId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}
	
}
