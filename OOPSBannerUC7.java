/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns using an Inner Static Class
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to encapsulate character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * 
         * @param character The character (O, P, S)
         * @param pattern   The 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a given character
     * 
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // fallback empty pattern
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Define patterns for O, P, S
        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
            }),

            new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            })
        };

        String word = "OOPS";

        // Build banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] charPattern = getCharacterPattern(ch, patterns);
                line.append(charPattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}
