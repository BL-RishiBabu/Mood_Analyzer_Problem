public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "Default Mood";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (this.message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Mood cannot be empty");
            }

            return this.message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Mood cannot be null");
        }
    }
}