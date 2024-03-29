package nl.rls.composer.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class OwnedEntity {
	@Id 	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	private Integer ownerId;
	
	public OwnedEntity(Integer ownerId) {
		this.ownerId = ownerId;
	}

}
