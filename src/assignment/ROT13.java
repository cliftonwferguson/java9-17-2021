package assignment;

public class ROT13 {
	
	public static void main(String[] args) {
        String string = "This will be encrypted";
        System.out.println(rot13(string));
    }

    public static String rot13(String str) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (!Character.isLetter(c)) {
                builder.append(c);
                continue;
            }

            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')){
                c += 13;
            } else {
                c -= 13;
            }

            builder.append(c);
        }

        return builder.toString();
    }

}
