package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	private List<Subscriber> subs = new ArrayList<>();
	private String title;
	
	
	public String getTitle() {
		return title;
	}

	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();		
	}
	
	public void notifySubscribers() {
		for(Subscriber sub : subs) {
			System.out.println("Hi " + sub.getName() + ", New video has been uploaded: " + title);
		}
	}
}
