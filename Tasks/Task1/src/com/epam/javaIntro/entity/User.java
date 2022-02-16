package com.epam.javaIntro.entity;

public class User {

	private int id;
	private String name;
	private String login;
	private int password;
	private String email;
	private UserType userType;
	
	public User() {
		super();
	}

	public User(int id, String name, String login, String password, String email, 
			UserType userType, boolean isCoding) {
		super();
		setId(id);
		setName(name);
		setLogin(login);
		if (isCoding) {
			setPassword(password);
		} else {
			this.password = Integer.parseInt(password);
		}
		setEmail(email);
		setUserType(userType);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", login=" + login + ", email=" + email
				+ ", userType=" + userType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + password;
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password != other.password)
			return false;
		if (userType != other.userType)
			return false;
		return true;
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

	public int getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = ("Ud76cQ" + password).hashCode();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.matches(".+@mail.ru$")) {
			this.email = email;
		} else {
			this.email = "";
		}
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public enum UserType {
		ADMIN("Администратор"),
		USER("Пользователь"),
		UNIDENTIFIED("Неопознанный");
		
		private final String value;
		
		private UserType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
