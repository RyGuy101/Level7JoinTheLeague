package org.jointheleague.food;

public class CookieUpdater {

	public void updateName(Cookie aCookie) {
		aCookie.setName("Tasty " + aCookie.getName());
	}
}

class Cookie {

	private String name;

	public Cookie(String string) {
		this.name = string;
	}

	public void setName(String string) {
		this.name = string;
	}

	public String getName() {
		return this.name;
	}
}


