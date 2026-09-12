public class MovieReviewProfiler {
    public static void main(String[] args) {

        String review = "This movie was absolutely fantastic and thrilling";


        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;


        String[] words = review.split("\\s+");


        for (String word : words) {
            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }


        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }
}