package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Elena");
        User user2 = new User("Friend");
        User user3 = new User("Best friend");

        user1.sendMessage(user2, "Hi!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "I am fine");
        user2.sendMessage(user1, "Thanks");
        user2.sendMessage(user1, "What about you?");
        user3.sendMessage(user1, "Hey Hey Hey!");
        user3.sendMessage(user1, "What about ski?");
        user3.sendMessage(user1, "Join us! We are going to ski today!");
        user1.sendMessage(user3, "No, thanks. I am learning Java today and tomorrow. And every day.");

        MessageDatabase.showDialog(user1, user3);

    }
}
