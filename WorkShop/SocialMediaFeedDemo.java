package WorkShop;
abstract class Notification {
    String message;

    public Notification(String message) {
        this.message = message;
    }

    public abstract String display();
}

class LikeNotification extends Notification {
    public LikeNotification(String message) {
        super(message);
    }

    @Override
    public String display() {
        return " Like: " + message;
    }
}


class CommentNotification extends Notification {
    public CommentNotification(String message) {
        super(message);
    }

    @Override
    public String display() {
        return " Comment: " + message;
    }
}


class Node {
    Notification notification;
    Node next;

    public Node(Notification notification) {
        this.notification = notification;
        this.next = null;
    }
}


class NotificationFeed {
    private Node head;

    public void addNotification(Notification notification) {
        Node newNode = new Node(notification);
        newNode.next = head;
        head = newNode;
    }

    public void displayFeed() {
        Node current = head;
        while (current != null) {
            System.out.println(current.notification.display());
            current = current.next;
        }
    }
}


public class SocialMediaFeedDemo {
    public static void main(String[] args) {
        NotificationFeed feed = new NotificationFeed();

        feed.addNotification(new LikeNotification("User1 liked your post."));
        feed.addNotification(new CommentNotification("User2 commented: Nice work!"));
        feed.addNotification(new LikeNotification("User3 liked your photo."));

        System.out.println(" Notification Feed (Most Recent First):\n");
        feed.displayFeed();
    }
}