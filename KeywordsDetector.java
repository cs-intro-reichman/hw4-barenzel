public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] sentencesLowerCase = lowerCase(sentences);
        String[] keywordsLowerCase = lowerCase(keywords);
        for (int i = 0; i < sentencesLowerCase.length; i++) {
            for (int j = 0; j < keywordsLowerCase.length; j++) {
            if (sentencesLowerCase[i].indexOf(keywordsLowerCase[j]) >= 0) {
                System.out.println(sentences[i]);
                }
            }  
        }    
    }
    public static String[] lowerCase(String[] arr) {
        String[] lowerCaseVersion = new String[arr.length];
        for (int i = 0; i < lowerCaseVersion.length; i++) {
            lowerCaseVersion[i] = arr[i].toLowerCase();
        }
        return lowerCaseVersion;
    }
}
