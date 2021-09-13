package Project05;


public class Person {

	private Phone[] phones;
	private Phone homePhone;
	private Phone officePhone;
	
	public Person() {
		phones = new Phone[2];
		}
	public Phone getPhone(int i) {
		if (i == 0 || i == 1)
			return phones[i]
			
			return null;
		
	}
	
	
}
