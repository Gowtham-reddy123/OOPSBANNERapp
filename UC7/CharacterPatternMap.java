public class OOPSBannerApp {

    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] pPattern = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] sPattern = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        String[] spacePattern = {
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern),
            new CharacterPatternMap(' ', spacePattern)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
