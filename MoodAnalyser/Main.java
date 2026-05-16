public class Main {
    public static void main(String[] args) {
        System.out.println("--- Running Mood Analyzer Tests ---");

        try {
            System.out.print("TC 3.1 Testing Null Mood -> ");
            MoodAnalyser nullAnalyser = new MoodAnalyser(null);
            nullAnalyser.analyseMood();
            System.out.println("[FAIL] No exception thrown.");
        } catch (MoodAnalysisException e) {
            if (e.type == MoodAnalysisException.ExceptionType.ENTERED_NULL) {
                System.out.println("[PASS] Threw MoodAnalysisException of type ENTERED_NULL. Message: " + e.getMessage());
            } else {
                System.out.println("[FAIL] Threw wrong exception type.");
            }
        }

        try {
            System.out.print("TC 3.2 Testing Empty Mood -> ");
            MoodAnalyser emptyAnalyser = new MoodAnalyser("");
            emptyAnalyser.analyseMood(); // This should throw an exception
            System.out.println("[FAIL] No exception thrown.");
        } catch (MoodAnalysisException e) {
            if (e.type == MoodAnalysisException.ExceptionType.ENTERED_EMPTY) {
                System.out.println("[PASS] Threw MoodAnalysisException of type ENTERED_EMPTY. Message: " + e.getMessage());
            } else {
                System.out.println("[FAIL] Threw wrong exception type.");
            }
        }

        try {
            System.out.print("Testing Valid Mood -> ");
            MoodAnalyser validAnalyser = new MoodAnalyser("I am in Sad Mood");
            String result = validAnalyser.analyseMood();
            System.out.println("[PASS] Result: " + result);
        } catch (MoodAnalysisException e) {
            System.out.println("[FAIL] Unexpected exception thrown: " + e.getMessage());
        }
    }
}