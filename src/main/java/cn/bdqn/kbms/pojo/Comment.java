package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * tb_comment评论表
 * @author lenovo
 *
 */
public class Comment {
	private Integer commentId;//评论id
	private Integer knowledgeId;//知识id
	private String comment;//评论内容
	private Date createDate;//评论时间
	private Integer auditState;//'审核状态 0：未审核 1：已审核 2：审核不通过'
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public Integer getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(Integer knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getAuditState() {
		return auditState;
	}
	public void setAuditState(Integer auditState) {
		this.auditState = auditState;
	}
	
}
