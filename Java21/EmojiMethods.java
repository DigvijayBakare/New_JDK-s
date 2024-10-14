package Java21;

public class EmojiMethods {
    public static void isEmojiMethod() {
        int codePoint = 0x1F600; // Unicode for 😀
        boolean isEmoji = Character.isEmoji(codePoint);
        System.out.println("Is Emoji: " + isEmoji);
    }

    public static void isEmojiComponentMethod() {
        int codePoint = 0x1F3FB; // Unicode for 🏻 (emoji modifier)
        boolean isEmojiComponent = Character.isEmojiComponent(codePoint);
        System.out.println("Is Emoji Component: " + isEmojiComponent);
    }

    public static void isEmojiModifierMethod() {
        int codePoint = 0x1F3FB; // Unicode for 🏻 (emoji modifier)
        boolean isEmojiModifier = Character.isEmojiModifier(codePoint);
        System.out.println("Is Emoji Modifier: " + isEmojiModifier);
    }

    public static void isEmojiModifierBaseMethod() {
        int codePoint = 0x1F466; // Unicode for 👦 (boy)
        boolean isEmojiModifierBase = Character.isEmojiModifierBase(codePoint);
        System.out.println("Is Emoji Modifier Base: " + isEmojiModifierBase);
    }

    public static void isEmojiPresentationMethod() {
        int codePoint = 0x1F600; // Unicode for 😀
        boolean isEmojiPresentation = Character.isEmojiPresentation(codePoint);
        System.out.println("Is Emoji Presentation: " + isEmojiPresentation);
    }

    public static void isExtendedPictographicMethod() {
        int codePoint = 0x1F600; // Unicode for 😀
        boolean isExtendedPictographic = Character.isExtendedPictographic(codePoint);
        System.out.println("Is Extended Pictographic: " + isExtendedPictographic);
    }
    public static void main(String[] args) {
        isEmojiMethod();
        isEmojiComponentMethod();
        isEmojiModifierMethod();
        isEmojiModifierBaseMethod();
        isEmojiPresentationMethod();
        isExtendedPictographicMethod();
    }
}
