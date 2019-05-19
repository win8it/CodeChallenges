package zalandocode;

public class Main {

    public static void main(String[] args) {
        System.out.println(corpMessagewithKLimit("Hello World! Hello World! Hello World! Hello World! Hello World!",
                20));

    }
    public static String corpMessagewithKLimit(String message, int limit) {
        String returnedMessage = message;
        int messageLeng = message.length();
        if (messageLeng > limit) {
            if (returnedMessage.contains(" ")) {
                int lastSpace = returnedMessage.lastIndexOf(" ");
                lastSpace = (lastSpace <= limit) ? lastSpace : findLastspace(returnedMessage, limit);
                returnedMessage = returnedMessage.substring(0, lastSpace);
            } else return "";
        }
        return returnedMessage;
    }
    private static int findLastspace(String returnedMessage, int limit) {
        int lastSpace = 0;
        for (int i=0; returnedMessage.indexOf(" ", i) <= limit; i++){
            lastSpace = returnedMessage.indexOf(" ", i);
        }
        return lastSpace;
    }
}
