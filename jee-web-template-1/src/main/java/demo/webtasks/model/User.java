package demo.webtasks.model;

import demo.annotation.Column;

public class User extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("email")
	private String email;

	@Column("password")
	private String password;

	@Column("name")
	private String name;

	@Column("roleId")
	private int roleId;

	@Column("isActive")
	private int isActive;

	@Column("securiteNumber")
	private String securiteNumber;

	@Column("resumeId")
	private Integer resumeId;

	@Column("telephone")
	private Long telephone;

	@Column("lastName")
	private String lastName;

	public User() {
		super();
	}

	public User(String email, String password, String name, int roleId,
			String securiteNumber, Long telephone, String lastName) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.roleId = roleId;
		this.securiteNumber = securiteNumber;
		this.telephone = telephone;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getSecuriteNumber() {
		return securiteNumber;
	}

	public void setSecuriteNumber(String securiteNumber) {
		this.securiteNumber = securiteNumber;
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	protected Object getIdModel() {
		return getId();
	}

}
