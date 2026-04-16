import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Function to create pattern map
    public static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        map.put('P', new String[]{
                "****",
                "*   *",
                "*   *",
                "****",
                "*",
                "*",
                "*"
        });

        map.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        return map;
    }

    // Function to print banner
    public static void printBanner(String text) {

        Map<Character, String[]> patterns = getPatterns();

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = patterns.get(ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}