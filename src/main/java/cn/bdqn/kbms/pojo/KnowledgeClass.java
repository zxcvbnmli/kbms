package cn.bdqn.kbms.pojo;
/**
 * tb_knowledgeClass 知识类别
 * @author lenovo
 *
 */
public class KnowledgeClass {
	private Integer knowClassId;//知识类别id
	private String knowClassName;//知识类别名称
	private Integer knowledgeClassCode;//类别编号
	private Integer knowParentId;//父类id
	private Integer knowledgeDept;//层级
	public Integer getKnowClassId() {
		return knowClassId;
	}
	public void setKnowClassId(Integer knowClassId) {
		this.knowClassId = knowClassId;
	}
	public String getKnowClassName() {
		return knowClassName;
	}
	public void setKnowClassName(String knowClassName) {
		this.knowClassName = knowClassName;
	}
	public Integer getKnowledgeClassCode() {
		return knowledgeClassCode;
	}
	public void setKnowledgeClassCode(Integer knowledgeClassCode) {
		this.knowledgeClassCode = knowledgeClassCode;
	}
	public Integer getKnowParentId() {
		return knowParentId;
	}
	public void setKnowParentId(Integer knowParentId) {
		this.knowParentId = knowParentId;
	}
	public Integer getKnowledgeDept() {
		return knowledgeDept;
	}
	public void setKnowledgeDept(Integer knowledgeDept) {
		this.knowledgeDept = knowledgeDept;
	}
	
}
