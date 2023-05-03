package POJO;

public class GoogleAccount1 {
	private String firstName;

	private String lastName;

	private String Username;

	private String Passwd;

	private String ConfirmPasswd;

	public String getFirstName() {
		return firstName;
	}

	public GoogleAccount1 setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public GoogleAccount1 setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getUsername() {
		return Username;
	}

	public GoogleAccount1 setUsername(String username) {
		Username = username;
		return this;
	}

	public String getPasswd() {
		return Passwd;
	}

	public GoogleAccount1 setPasswd(String passwd) {
		Passwd = passwd;
		return this;
	}

	public String getConfirmPasswd() {
		return ConfirmPasswd;
	}

	public GoogleAccount1 setConfirmPasswd(String confirmPasswd) {
		ConfirmPasswd = confirmPasswd;

		return this;
	}

	@Override
	public String toString() {
		return "GoogleAccount1 [firstName=" + firstName + ", lastName=" + lastName + ", Username=" + Username
				+ ", Passwd=" + Passwd + ", ConfirmPasswd=" + ConfirmPasswd + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ConfirmPasswd == null) ? 0 : ConfirmPasswd.hashCode());
		result = prime * result + ((Passwd == null) ? 0 : Passwd.hashCode());
		result = prime * result + ((Username == null) ? 0 : Username.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		GoogleAccount1 other = (GoogleAccount1) obj;
		if (ConfirmPasswd == null) {
			if (other.ConfirmPasswd != null)
				return false;
		} else if (!ConfirmPasswd.equals(other.ConfirmPasswd))
			return false;
		if (Passwd == null) {
			if (other.Passwd != null)
				return false;
		} else if (!Passwd.equals(other.Passwd))
			return false;
		if (Username == null) {
			if (other.Username != null)
				return false;
		} else if (!Username.equals(other.Username))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public GoogleAccount1() {
		super();
		// TODO Auto-generated constructor stub

}
}
