class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setChannel(int channel) {
		this.prevChannel = this.channel;
		if(channel > MAX_CHANNEL) {
			this.channel = MAX_CHANNEL;
		}
		else if(channel < MIN_CHANNEL) {
			this.channel = MIN_CHANNEL;
		}
		else {
			this.channel = channel;
		}
	}
	
	void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
	}
	
	int getChannel() {
		return this.channel;
	}
	
	int getVolume() {
		return this.volume;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}

public class Exercise7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
		
		System.out.println();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
