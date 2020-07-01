package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * tb_knowledgeAudit知识审核表
 * @author lenovo
 *
 */
public class KnowledgeAudit {
	private Integer auditId;//审核id
	private Integer knowledgeId;//知识id
	private String auditer;//审核人
	private Date auditDate;//审核时间
	private String opinion;//审核意见
	public Integer getAuditId() {
		return auditId;
	}
	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}
	public Integer getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(Integer knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getAuditer() {
		return auditer;
	}
	public void setAuditer(String auditer) {
		this.auditer = auditer;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
}
