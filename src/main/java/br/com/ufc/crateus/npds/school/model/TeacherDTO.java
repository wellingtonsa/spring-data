package br.com.ufc.crateus.npds.school.model;

public class TeacherDTO {
	private int id;
	private String name;
	private String login;
	
	public TeacherDTO(Teacher teacher) {
		super();
		this.id = teacher.getId();
		this.name = teacher.getName();
		this.login = teacher.getLogin();
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}



}
