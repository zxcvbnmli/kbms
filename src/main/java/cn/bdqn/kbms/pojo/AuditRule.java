package cn.bdqn.kbms.pojo;
/**
 * tb_auditRule审核权限表
 * @author lenovo
 *
 */
public class AuditRule {
	private Integer userRuleMid;//主键id
	private Integer audituserId;//审核用户id
	private Integer userId;//被审核用户id
	public Integer getUserRuleMid() {
		return userRuleMid;
	}
	public void setUserRuleMid(Integer userRuleMid) {
		this.userRuleMid = userRuleMid;
	}
	public Integer getAudituserId() {
		return audituserId;
	}
	public void setAudituserId(Integer audituserId) {
		this.audituserId = audituserId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
