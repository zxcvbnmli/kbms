package cn.bdqn.kbms.pojo;
/*
 * tb_role 角色表
 * */
public class Role {
	private Integer roleId;//角色id
	private String roleName;//角色名称
	private Integer roleLevel;//角色级别0-9
	private Integer parentId;//上级角色id
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getRoleLevel() {
		return roleLevel;
	}
	public void setRoleLevel(Integer roleLevel) {
		this.roleLevel = roleLevel;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
