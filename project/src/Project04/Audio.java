package Project04;

public class Audio implements RemoteControl{

	// 필드 
	private int volume;
	
	// turnOn() 추상 메소드의 실제 메소드
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	// turnOff 추상 메소드의 실제 메소드
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	// setVolume() 추상 메소드의 실제 메소드
	private void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLLUME) {
			this.volume = RemoteControl.MAX_VOLLUME;
		}else if(volume<RemoteControl.MIN_VOLLUME) {
			this.volume = RemoteControl.MIN_VOLLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 AUDIO 볼륨" + this.volume);
	}
}
