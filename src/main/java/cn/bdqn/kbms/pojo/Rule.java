package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * tb_rule 权限表
 * @author lenovo
 *
 */
public class Rule {
	private Integer ruleId;//权限id
	private String ruleName;//权限名称
	private Date createDate;//添加时间
	public Integer getRuleId() {
		return ruleId;
	}
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
