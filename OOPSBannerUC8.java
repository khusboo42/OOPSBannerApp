import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        // Step 1: Build character pattern map
        Map<Character, String[]> patternMap = buildPatternMap();

        // Step 2: Word to display
        String word = "OOPS";

        // Step 3: Render banner
        printBanner(word, patternMap);
    }

    // Utility Method: Build HashMap of patterns
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        map.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        map.put('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });

        return map;
    }

    // Utility Method: Print Banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = 7;

        // Outer loop → each row
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            // Inner loop → each character
            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            // Print constructed row
            System.out.println(line.toString());
        }
    }
}