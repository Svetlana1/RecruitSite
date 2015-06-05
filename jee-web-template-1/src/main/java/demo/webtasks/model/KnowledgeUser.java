package demo.webtasks.model;

import demo.annotation.Column;

public class KnowledgeUser extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("knowledgeId")
	private int knowledgeId;

	@Column("userId")
	private int userId;

	public KnowledgeUser() {

	}

	public KnowledgeUser(int knowledgeId, int userId) {
		super();
		this.knowledgeId = knowledgeId;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(int knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
