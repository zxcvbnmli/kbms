package cn.bdqn.kbms.pojo;

import java.util.Date;

/**
 * 知识信息表   tb_knowledgeMe
 * @author lenovo
 *
 */
public class KnowledgeMes {
	private Integer knowledgeId;//知识id
	private String knowledgeName;//知识名称
	private String knowledgeDetail;//知识描述
	private String solution;//解决方法
	private Integer knowledgeClassId;//知识类别
	private String annexFileName;//附件名称
	private String annexFilePath;//附件路径
	private Integer auditState;//审核状态
	private String userGroupId;//用户组
	private Date createDate;//创建时间
	private String createUser;//创建人
	private Date updateDate;//修改时间
	private String updateUser;//修改人
	public Integer getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(Integer knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getKnowledgeName() {
		return knowledgeName;
	}
	public void setKnowledgeName(String knowledgeName) {
		this.knowledgeName = knowledgeName;
	}
	public String getKnowledgeDetail() {
		return knowledgeDetail;
	}
	public void setKnowledgeDetail(String knowledgeDetail) {
		this.knowledgeDetail = knowledgeDetail;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public Integer getKnowledgeClassId() {
		return knowledgeClassId;
	}
	public void setKnowledgeClassId(Integer knowledgeClassId) {
		this.knowledgeClassId = knowledgeClassId;
	}
	public String getAnnexFileName() {
		return annexFileName;
	}
	public void setAnnexFileName(String annexFileName) {
		this.annexFileName = annexFileName;
	}
	public String getAnnexFilePath() {
		return annexFilePath;
	}
	public void setAnnexFilePath(String annexFilePath) {
		this.annexFilePath = annexFilePath;
	}
	public Integer getAuditState() {
		return auditState;
	}
	public void setAuditState(Integer auditState) {
		this.auditState = auditState;
	}
	public String getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	
}
