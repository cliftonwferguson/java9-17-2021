package sept92021;



public class Assignment {
	
	static String size(String size) {
		String answer = "";
		
		
		
		String format = size.substring(size.length()-2);
		double number = Double.parseDouble(size.substring(0, size.length()-2));
		number = number * 97/100;
		
		if (number == 1) {
			number = number * 1024;
			format = "MB";
		};
		
		if (format.equals("GB")) {
			float f = (float)number;
			f = f * 0.9f;
			answer = f + format;
		} else if (format.equals("MB")) {
			number = (double)(number * 0.93f);
			answer = number + format;
		};
		
		return answer;
	};
	
	public static void main(String[] args) {
		System.out.println("32 is " + size("32GB"));
		System.out.println("512MB is " + size("512MB"));
		System.out.println("2GB is " + size("2GB"));
	};

}
