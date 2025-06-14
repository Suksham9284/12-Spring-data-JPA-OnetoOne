package in.ashokit.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Passport;
import in.ashokit.entities.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service

public class PersonPassportService {
	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private PassportRepo passportRepo;
	
	public void savePersonWithPassport() {
		
	Passport pp = new Passport();
	pp.setPassportNum("J97979SDF");
	pp.setIssueDate(LocalDate.now());
	pp.setExpireDate(LocalDate.now().plusYears(10));
	
	Person p = new Person();
	p.setName("John");
	p.setGender("Male");
	
	//associating entities
	p.setPassport(pp);
	pp.setPerson(p);
	
	//save the person
	personRepo.save(p);
	System.out.println("Record saved......");
	}
	
	

}
