package demo.webtasks.model;

import demo.annotation.Column;

public class Vacancy extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("vacancy")
	private String vacancy;

	public Vacancy() {

	}

	public Vacancy(String vacancy) {
		super();
		this.vacancy = vacancy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVacancy() {
		return vacancy;
	}

	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}

	@Override
	protected Object getIdModel() {
		return getId();
	}

}
