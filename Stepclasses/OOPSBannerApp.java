/**
 * OOPS Banner App
 *
 * UC7: Store character pattern using Inner Static Class
 *
 * @author Abhiram
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate a character
     * and its corresponding banner pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character banner character
         * @param pattern 7-line banner pattern
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
         * Getter for banner pattern
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get CharacterPatternMap array
     *
     * @return array of CharacterPatternMap objects
     */
    private static CharacterPatternMap[] getCharacterPatterns() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),

            new CharacterPatternMap('P', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
            }),

            new CharacterPatternMap('S', new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            })
        };
    }

   public static void main(String[] args) {

    CharacterPatternMap[] patterns = getCharacterPatterns();

    CharacterPatternMap o = patterns[0]; // O
    CharacterPatternMap p = patterns[1]; // P
    CharacterPatternMap s = patterns[2]; // S

    // Banner has 7 rows
    for (int row = 0; row < 7; row++) {

        StringBuilder lineBuilder = new StringBuilder();

        // O O P S (correct order)
        lineBuilder.append(o.getPattern()[row]).append(" ");
        lineBuilder.append(o.getPattern()[row]).append(" ");
        lineBuilder.append(p.getPattern()[row]).append(" ");
        lineBuilder.append(s.getPattern()[row]);

        System.out.println(lineBuilder.toString());
    }
}
}