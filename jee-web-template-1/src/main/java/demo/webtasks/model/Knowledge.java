package demo.webtasks.model;

import demo.annotation.Column;

public class Knowledge extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("knowledge")
	private String knowledge;

	public Knowledge() {

	}

	public Knowledge(String knowledge) {
		super();
		this.knowledge = knowledge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

	@Override
	protected Object getIdModel() {
		return getId();
	}
}
