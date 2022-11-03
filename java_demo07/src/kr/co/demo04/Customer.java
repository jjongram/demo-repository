package kr.co.demo04;

public class Customer extends Person {

	@Override
	public String getFirstName() {
		return getName().substring(0, 1);
	}

	@Override
	public String getLastName() {
		return getName().substring(1);
	}

}
