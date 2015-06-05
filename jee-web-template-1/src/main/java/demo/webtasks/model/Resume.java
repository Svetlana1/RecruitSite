package demo.webtasks.model;

import demo.annotation.Column;

public class Resume extends AbstractModelBean implements IEntity {

	@Column("id")
	private int id;

	@Column("experienceAge")
	private int experienceAge;

	@Column("education")
	private String education;

	@Column("driveLicense")
	private int driveLicense;

	@Column("qualifications")
	private String qualifications;

	@Column("workExperience")
	private String workExperience;

	@Column("professionalSummary")
	private String professionalSummary;

	@Column("vacancyId")
	private int vacancyId;

	public Resume() {

	}

	public Resume(int experienceAge, String education, int driveLicense,
			String qualifications, String workExperience,
			String professionalSummary, int vacancyId) {
		super();
		this.experienceAge = experienceAge;
		this.education = education;
		this.driveLicense = driveLicense;
		this.qualifications = qualifications;
		this.workExperience = workExperience;
		this.professionalSummary = professionalSummary;
		this.vacancyId = vacancyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExperienceAge() {
		return experienceAge;
	}

	public void setExperienceAge(int experienceAge) {
		this.experienceAge = experienceAge;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getDriveLicense() {
		return driveLicense;
	}

	public void setDriveLicense(int driveLicense) {
		this.driveLicense = driveLicense;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getProfessionalSummary() {
		return professionalSummary;
	}

	public void setProfessionalSummary(String professionalSummary) {
		this.professionalSummary = professionalSummary;
	}

	public int getVacancyId() {
		return vacancyId;
	}

	public void setVacancyId(int vacancyId) {
		this.vacancyId = vacancyId;
	}

	@Override
	protected Object getIdModel() {
		return getId();
	}
}
