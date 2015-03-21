
public class TestCompareStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compare("anu","Api"));

	}





	public static boolean compare(String username, String password) {
		boolean flag = true;

		StringBuffer pass = new StringBuffer(password);
		StringBuffer user = new StringBuffer(username);

		int ulength = username.length();
		int plength = password.length();

		if (ulength > plength) {
			for (int i = 0; i < (ulength - plength); i++) {
				pass.append("·");

			}
		} else {
			for (int i = 0; i < (plength - ulength); i++) {
				user.append("·");
			}

		}
		String usernm = user.toString();
		char[] u = usernm.toCharArray();

		String passwd = pass.toString();
		char[] p = passwd.toCharArray();

		for (int i = 0; i < user.length(); i++) {

			for (int j = 0; j < pass.length(); j++) {

				if (u[i] != p[j]) {

				} else {

					flag = false;
				}

			}

		}

		return flag;
	}

}

