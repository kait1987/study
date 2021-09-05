package new1;

public class ContactMain {
	public static void main(String[] args) {
		
		Contact contact = new Contact();
		
		System.out.println("이름 : " + contact.getName() );
		System.out.println("전화번호 : " + contact.getNumber() );
		System.out.println("이메일 : " + contact.getEmail() );
		System.out.println("주소 : " + contact.getAddress() );
		System.out.println("생일 : " + contact.getBirthday() );
		System.out.println("그룹 : " + contact.getGroup() );

		
		// 필드값 변경
		
		Contact contact2 = new Contact(); 
		
		System.out.println("------------------");
		System.out.println("       그룹변경      ");	
		System.out.println("------------------");	
		System.out.println("이름 : " + contact2.getName() );
		System.out.println("전화번호 : " + contact2.getNumber() );
		System.out.println("이메일 : " + contact2.getEmail() );
		System.out.println("주소 : " + contact2.getAddress() );
		System.out.println("생일 : " + contact2.getBirthday() );
		System.out.println("그룹 : " + contact2.getGroup2() );
		
	}

}
