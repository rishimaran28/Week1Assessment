public class TypingSpeed {
    public static void main(String[] args) {

        String original = "hello world";
        String typed = "hello worlt";

        String fault = "";
        int pos = 0;
        int c = 0;

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) != typed.charAt(i)) {
                c++;
                fault = String.valueOf(typed.charAt(i));
                pos = i;
            }
        }

        int m = original.length() - c;

        double accuracy = ((double) m / original.length()) * 100;

        System.out.print("Matched " + m + "/" + original.length() + " | ");
        System.out.println("Accuracy: " + accuracy + "%");
        System.out.println("Fault: " + fault);
        System.out.println("Position: " + pos);
    }
}