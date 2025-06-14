package in.ashokit.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer personID;
	private String name;
	private String Gender;
	@OneToOne(mappedBy="person" , cascade = CascadeType.ALL)
	private Passport passport;


}
