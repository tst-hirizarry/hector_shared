package com.example.rubenexample;

public class SessionManager {

	private static SessionManager INSTANCE;

	private boolean auth;

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	private SessionManager() {

	}

	public static SessionManager getInst() {
		if (INSTANCE == null) {
			INSTANCE = new SessionManager();
		}
		return INSTANCE;
	}

}
