public class OOPSBannerUC6 {

    // Helper method to generate pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", " *** "),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", " *** ")
        };
    }

    // Helper method to generate pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "**** "),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "**** "),
                String.join("", "*    "),
                String.join("", "*    "),
                String.join("", "*    ")
        };
    }

    // Helper method to generate pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", " ****"),
                String.join("", "*    "),
                String.join("", "*    "),
                String.join("", " *** "),
                String.join("", "    *"),
                String.join("", "    *"),
                String.join("", "**** ")
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build banner lines using method results
        String[] bannerLines = new String[]{
                o[0] + "  " + o[0] + "  " + p[0] + "  " + s[0],
                o[1] + "  " + o[1] + "  " + p[1] + "  " + s[1],
                o[2] + "  " + o[2] + "  " + p[2] + "  " + s[2],
                o[3] + "  " + o[3] + "  " + p[3] + "  " + s[3],
                o[4] + "  " + o[4] + "  " + p[4] + "  " + s[4],
                o[5] + "  " + o[5] + "  " + p[5] + "  " + s[5],
                o[6] + "  " + o[6] + "  " + p[6] + "  " + s[6]
        };

        // Loop-based rendering
        for (String line : bannerLines) {
            Syste