package facebooklearn;

public class Permutation {
	
	//int count =0;

	public static void main(String[] args) {
		
		Permutation p = new Permutation();
		p.permutation("nick");

	}

	void permutation(String str) {
		permutation(str, "");
	}

	void permutation(String str, String prefix) {
		//System.out.println(count++);
		if (str.length() == 0) {
				System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}

}
