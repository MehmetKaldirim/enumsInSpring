package com.zeroToHero;

public enum UserRole {

	DEVELOPER("Developer"), TEACHER("Teacher"), ADMIN("Admin"), TESTER("Tester");

	private final String role;

	UserRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
}