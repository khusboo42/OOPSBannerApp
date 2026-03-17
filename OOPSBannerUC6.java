public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Loop through 7 lines
        for (int i = 0; i < 7; i++) {
            // O O P S
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }

    // Helper method for O
    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Helper method for P
    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Helper method for S
    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }
}