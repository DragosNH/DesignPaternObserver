public class User {
    private String reciveNotification;

    public void update(int notification){
        this.reciveNotification = reciveNotification;
        System.out.println("Notification received: " + notification);
    }

    public String getReciveNotification() {
        return this.reciveNotification;
    }
}
