package com.qa.main;

public class YouTube {

	public static void main(String[] args) {
		
		Channel teamWater = new Channel();
		
		Subscriber s1 = new Subscriber("Liam");
		Subscriber s2 = new Subscriber("Nikolett");
		Subscriber s3 = new Subscriber("Simon");
		Subscriber s4 = new Subscriber("Sangiv");
		
		teamWater.subscribe(s1);
		teamWater.subscribe(s2);
		teamWater.subscribe(s3);
		teamWater.subscribe(s4);
		
//		s1.setChannel(teamWater);
//		s2.setChannel(teamWater);
//		s3.setChannel(teamWater);
//		s4.setChannel(teamWater);
		
		teamWater.upload("Watch our Presentation!");
		
		teamWater.unSubscribe(s1);
		
//		teamWater.upload("Watch our Presentation!");
		
	}

}
