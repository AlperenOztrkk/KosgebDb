import java.util.ArrayList;
import java.util.List;

import Entities.Applicant;
import Entities.Application;
import Entities.Attributes;
import Entities.Employee;
import Entities.Entrepreneur;
import Entities.LoanAttributes;
import Entities.Loans;
import Entities.Roles;
import Entities.UserRoles;

public class Main {

	public static void main(String[] args) {
	  Entrepreneur entrepreneur = new Entrepreneur();
	  entrepreneur.setFirtName("ali");
	  entrepreneur.setId(1);
	  entrepreneur.setLastName("veli");
	  entrepreneur.setUserName("velii");
	  entrepreneur.setPassword("12334");
	   
	  Loans erzurumKredisi= new Loans();
	  erzurumKredisi.setId(1);
	  erzurumKredisi.setLoanName("Erzurum Kredisi");
	  erzurumKredisi.setStartDate("25/02/2018");
	  
	  
	  Attributes cityAttribute=new Attributes(1,"Şehir","Erzurum");
	  Attributes loanVolume=new Attributes(2,"kredihacmi","50.000");
	  LoanAttributes attributes =new LoanAttributes(1,erzurumKredisi.getId(),1,2);
	 
	
	  Applicant applicant=new Applicant(entrepreneur);
	  Application application = new Application(1,applicant.getId(),erzurumKredisi.getId());
	  
	  Employee employee=new Employee(1,"Recep","40","2545");
	  Roles role1=new Roles(1,"Banka Müdürü");
	  Roles role2=new Roles(2,"Girişimci");
      
	  
	   
	  UserRoles userRole1=new UserRoles(1,employee.getId(),1);
	  UserRoles userRole2=new UserRoles(2,entrepreneur.getId() ,2);
	  
	  List<UserRoles> userRoles=new ArrayList<>();
	  userRoles.add(userRole1);
	  userRoles.add(userRole2);
	  
	  for(UserRoles userRole:userRoles) {
		  System.out.println(userRole.getId()+ " "+userRole.getUserId()+" "+userRole.getRoleId().get(0) );
	  }
	  
	  
	}

}
