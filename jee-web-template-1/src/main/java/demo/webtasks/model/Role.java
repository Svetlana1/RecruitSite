package demo.webtasks.model;

import demo.annotation.Column;

public class Role extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("role")
	private String role;

	public Role() {
		super();
	}

	public Role(String role) {
		super();
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	protected Object getIdModel() {
		return getId();
	}

}
