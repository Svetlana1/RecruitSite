package demo.webtasks.model;

import java.util.Date;

import demo.annotation.Column;

public class Communication extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("employerId")
	private int employerId;

	@Column("employeeId")
	private int employeeId;

	@Column("date")
	private Date date;

	@Column("marker")
	private int marker;

	@Column("sendingEmail")
	private int sendingEmail;

	@Column("comment")
	private String comment;

	public Communication() {

	}

	public Communication(int employerId, int employeeId, Date date, int marker,
			int sendingEmail, String comment) {
		super();
		this.employerId = employerId;
		this.employeeId = employeeId;
		this.date = date;
		this.marker = marker;
		this.sendingEmail = sendingEmail;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMarker() {
		return marker;
	}

	public void setMarker(int marker) {
		this.marker = marker;
	}

	public int getSendingEmail() {
		return sendingEmail;
	}

	public void setSendingEmail(int sendingEmail) {
		this.sendingEmail = sendingEmail;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	protected Object getIdModel() {
		return getId();
	}
}
