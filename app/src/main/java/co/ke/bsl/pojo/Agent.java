package co.ke.bsl.pojo;

// Generated Dec 15, 2015 12:42:43 PM by Hibernate Tools 4.3.1

import android.content.Context;

import java.util.Date;

/**
 * Agents generated by hbm2java
 */

public class Agent implements java.io.Serializable {

	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String userName;
	private String password;
	private Date dateCreated;
	private Context ctx;
	private String currentPassword;

	private String newPassword;

	private String repeatedPassword;

	private String status;

	public Agent() {
	}

	public Agent(Context context) {
		this.ctx = context;
	}

/*	public Agent(String firstName, String middleName, String lastName,
			String emailAddress, String phoneNumber, String userName,
			String password, Date dateCreated) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
		this.dateCreated = dateCreated;
	}*/

	public Agent(String userName, String password) {

		this.userName = userName;
		this.password = password;

	}

	public Agent(String currentPassword, String newPassword, String repeatedPassword ) {

		this.currentPassword =currentPassword;
		this.newPassword= newPassword;
		this.repeatedPassword=repeatedPassword;

	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}




	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the currentPassword
	 */
	public String getCurrentPassword() {
		return currentPassword;
	}

	/**
	 * @param currentPassword
	 *            the currentPassword to set
	 */
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * @param newPassword
	 *            the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	/**
	 * @return the repeatedPassword
	 */
	public String getRepeatedPassword() {
		return repeatedPassword;
	}

	/**
	 * @param repeatedPassword
	 *            the repeatedPassword to set
	 */
	public void setRepeatedPassword(String repeatedPassword) {
		this.repeatedPassword = repeatedPassword;
	}

}