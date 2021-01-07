package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean isSubsribed = subscriptions.contains(user);
        return isSubsribed;
    }

    public boolean isFriend(User user) {
        boolean isFollowed = user.getSubscriptions().contains(this);
        boolean isSubscribed = this.isSubscribed(user);
        if (isFollowed && isSubscribed) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);

    }

    @Override
    public String toString() {
        return username;
    }

}
