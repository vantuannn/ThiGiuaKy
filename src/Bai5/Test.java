package Bai5;

public class Test {
    public static void main(String[] args) {
        User user = new User("john123", "john@example.com", "password");
        user.register("john123", "john@example.com", "password");

        User.Admin admin = new User.Admin("admin01", "admin@example.com", "admin123");
        admin.login("admin01", "admin123");

        User.Customer customer = new User.Customer("customer01", "customer@example.com", "customer123");
        customer.login("customer01", "customer123");

        User.Moderator moderator = new User.Moderator("moderator01", "moderator@example.com", "moderator123");
        moderator.login("moderator01", "moderator123");
    }
}
