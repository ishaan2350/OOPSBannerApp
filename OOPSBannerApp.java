public class OOPSBannerApp {

    public static String getO() {
        return String.join("\n",
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        );
    }

    public static String getP() {
        return String.join("\n",
                "****",
                "*   *",
                "*   *",
                "****",
                "*",
                "*",
                "*"
        );
    }

    public static String getS() {
        return String.join("\n",
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        );
    }

    public static void main(String[] args) {

        String[] o = getO().split("\n");
        String[] p = getP().split("\n");
        String[] s = getS().split("\n");

        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}