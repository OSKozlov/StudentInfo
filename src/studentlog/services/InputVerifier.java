package studentlog.services;

public class InputVerifier {
	
	public static boolean verifyName(String name) {
		return name.matches("[A-��-�A-Z][�-�a-z]*\\s[A-��-�A-Z][�-�a-z]*");

	}
	
	public static boolean verifyGroupNumber(String group) {
		return group.matches("[0-9]*");
	}
	
	public static boolean verifyAddress(String address) {
		return address.matches("[�-��-�A-Z][�-�a-z]*,[0-9]*");
	}
	
	public static boolean verifyCity(String city) {
		return city.matches("[�-��-�A-Z][�-�a-z]*");
	}

	public static boolean verifyResultByFivePointSystem(String result) {
		return result.matches("[0-5]*");
	}
}
