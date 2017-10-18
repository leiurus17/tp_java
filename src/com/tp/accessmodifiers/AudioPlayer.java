package com.tp.accessmodifiers;

public class AudioPlayer {

	class OnlineAudioPlayer {
		protected boolean openSpeaker(Speaker sp) {
			// implementation details
			return false;
		}
	}
	
	class StreamingAudioPlayer {
		boolean openSpeaker(Speaker sp) {
			// implementation details
			return false;
		}
	}
	
    public void doNothing() {
		System.out.println("Do Nothing. Broken Audio.");
	}
	
}
