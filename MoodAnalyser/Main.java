public class Main {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        System.out.println("--- Running Mood Analyzer ---");

        String testCase1 = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.print("TC 1.1 (Expected: SAD) -> Result: " + testCase1);
        if (testCase1.equals("SAD")) {
            System.out.println(" [PASS]");
        } else {
            System.out.println(" [FAIL]");
        }

        String testCase2 = moodAnalyser.analyseMood("I am in Any Mood");
        System.out.print("TC 1.2 (Expected: HAPPY) -> Result: " + testCase2);
        if (testCase2.equals("HAPPY")) {
            System.out.println(" [PASS]");
        } else {
            System.out.println(" [FAIL]");
        }
    }
}