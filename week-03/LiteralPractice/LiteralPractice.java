public class LiteralPractice {

    public static void main(String[] args) {
        // Long literal with L suffix
        long l = 987654L;
        // Float literal with f suffix
        float f = 8.7f;
        // Char literal using Unicode escape sequence for ©
        char c = '\u00A9';
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Char with unicode " + c);
    }
}