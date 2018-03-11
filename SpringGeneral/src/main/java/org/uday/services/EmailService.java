package org.uday.services;

public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email sent to " + rec + " with message=" + msg);
		return false;
	}

}
