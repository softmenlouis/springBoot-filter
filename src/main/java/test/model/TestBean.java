package test.model;

import java.util.Date;

public class TestBean {
	private Integer id;

	private String desction;

	private Date createDate;

	private Date updateDate;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesction() {
		return desction;
	}
	public void setDesction(String desction) {
		this.desction = desction;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}