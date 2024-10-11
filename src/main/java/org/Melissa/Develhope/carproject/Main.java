// 2- Create Interface and implement it via abstract class

// -> Create Phone Interface, it should have call, text, showCallHistory and showTextHistory functions.
// -> Create SimplePhone abstract classes and implement those functions. When you use call function it should ask who you want to call then should store it, if you text it should ask your text message and who you text with.

// -> Create YourNamePhone(HuseyinPhone) and inherit the SimplePhone and test your codes.

// NOTE: You can add related information or some necessary information to your classes.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

interface Phone {
    void call(String name);
    void text(String name, String message);
    void showCallHistory();
    void showTextHistory();
}

abstract class SimplePhone implements Phone {
    protected ArrayList<String> callHistory = new ArrayList<>();
    protected ArrayList<String> textHistory = new ArrayList<>();

    @Override
    public void call(String name) {
        if (name.isEmpty()) {
            System.out.println("Invalid input. Call name cannot be empty.");
        } else {
            System.out.println("Calling " + name + "...");
            callHistory.add(name);
        }
    }

    @Override
    public void text(String name, String message) {
        if (name.isEmpty() || message.isEmpty()) {
            System.out.println("Invalid input. Text name and message cannot be empty.");
        } else {
            System.out.println("Texting " + name + ": " + message);
            textHistory.add("To: " + name + " - Message: " + message);
        }
    }

    @Override
    public void showCallHistory() {
        System.out.println("Call History:");
        if (callHistory.isEmpty()) {
            System.out.println("No calls made.");
        } else {
            for (String call : callHistory) {
                System.out.println(call);
            }
        }
    }

    @Override
    public void showTextHistory() {
        System.out.println("Text History:");
        if (textHistory.isEmpty()) {
            System.out.println("No texts sent.");
        } else {
            for (String text : textHistory) {
                System.out.println(text);
            }
        }
    }
}

class HuseyinPhone extends SimplePhone {
    private Set<String> favoriteContacts = new HashSet<>(); //
    public void addToFavorites(String name) {
        if (name.isEmpty()) {
            System.out.println("Invalid input. Favorite contact name cannot be empty.");
        } else {
            favoriteContacts.add(name);
            System.out.println(name + " added to favorites.");
        }
    }

    public void showFavoriteContacts() {
        System.out.println("Favorite Contacts:");
        if (favoriteContacts.isEmpty()) {
            System.out.println("No favorite contacts.");
        } else {
            for (String contact : favoriteContacts) {
                System.out.println(contact);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HuseyinPhone myPhone = new HuseyinPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Who would you like to call? ");
        String callName = scanner.nextLine();
        myPhone.call(callName);
        System.out.print("Who would you like to text? ");
        String textName = scanner.nextLine();
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        myPhone.text(textName, message);
        System.out.print("Who would you like to add to favorites? ");
        String favoriteName = scanner.nextLine();
        myPhone.addToFavorites(favoriteName);
        myPhone.showCallHistory();
        myPhone.showTextHistory();
        myPhone.showFavoriteContacts();

        scanner.close();
    }
}