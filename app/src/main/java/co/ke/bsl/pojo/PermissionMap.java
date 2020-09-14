package co.ke.bsl.pojo;
// Generated Dec 15, 2015 12:42:43 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Permissionsmap generated by hbm2java
 */

public class PermissionMap  implements java.io.Serializable {


     private Integer id;
     private Role roles;
     private Integer permissionId;
     private Date creationTime;

    public PermissionMap() {
    }

    public PermissionMap(Role roles, Integer permissionId, Date creationTime) {
       this.roles = roles;
       this.permissionId = permissionId;
       this.creationTime = creationTime;
    }

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the roles
	 */
	public Role getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Role roles) {
		this.roles = roles;
	}

	/**
	 * @return the permissionId
	 */
	public Integer getPermissionId() {
		return permissionId;
	}

	/**
	 * @param permissionId the permissionId to set
	 */
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	/**
	 * @return the creationTime
	 */
	public Date getCreationTime() {
		return creationTime;
	}

	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
   


}

