public class Main {
    public static void main(String[] args) {
        System.out.println("--- Running Mood Analyzer ---");
        
        MoodAnalyser sadAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result1 = sadAnalyser.analyseMood();
        System.out.print("Repeat TC 1.1 (Expected: SAD) -> Result: " + result1);
        System.out.println(result1.equals("SAD") ? " [PASS]" : " [FAIL]");

        MoodAnalyser happyAnalyser = new MoodAnalyser("I am in Happy Mood");
        String result2 = happyAnalyser.analyseMood();
        System.out.print("Repeat TC 1.2 (Expected: HAPPY) -> Result: " + result2);
        System.out.println(result2.equals("HAPPY") ? " [PASS]" : " [FAIL]");

        MoodAnalyser nullAnalyser = new MoodAnalyser(null);
        String result3 = nullAnalyser.analyseMood();
        System.out.print("TC 2.1 (Expected: HAPPY) -> Result: " + result3);
        System.out.println(result3.equals("HAPPY") ? " [PASS]" : " [FAIL]");
    }
}