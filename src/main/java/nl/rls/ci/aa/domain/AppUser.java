package nl.rls.ci.aa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@Column(unique=true)
	private String username;
	private String email;
	private String password;
//	@Column(columnDefinition="tinyint(1) default 1")
	private boolean enabled;
//	@Column(columnDefinition="tinyint(1) default 0")
//	private boolean tokenExpired;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", 
		joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private List<Role> roles = new ArrayList<>();
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	public AppUser(String firstName, String lastName, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = username;
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + ", enabled=" + enabled + ", roles=" + roles + ", owner=" + owner + "]";
	}
	
	

}