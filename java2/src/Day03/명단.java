package Day03;

public class 명단<매개클래스> {
	
	String 명단명;
	매개클래스[] 고객목록;
	
	public 명단(String 명단명) {
		this.명단명 = 명단명;
		고객목록 = (매개클래스[])new Object[10];
	}
	
	// 배열에 저장하는 메소드 [ 공백이면 명단 추가 ]  
	public void add( 매개클래스 매개객체 ) {
		for( int i = 0 ;  i< 고객목록.length ; i++ ) {
			if( 고객목록[i] == null ) { 고객목록[i] = 매개객체; break; }
		}
	}
	public String get명단명() {
		return 명단명;
	}

	public void set명단명(String 명단명) {
		this.명단명 = 명단명;
	}

	public 매개클래스[] get고객목록() {
		return 고객목록;
	}

	public void set고객목록(매개클래스[] 고객목록) {
		this.고객목록 = 고객목록;
	}
	
	
	
	
	
	
	
	
	
	
	

}
