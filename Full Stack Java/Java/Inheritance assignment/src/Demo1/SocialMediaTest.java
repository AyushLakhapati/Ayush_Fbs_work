package Demo1;

// Base class
class SocialMediaAccount {
    String username;
    int followersCount;
    boolean verified;
    String accountCreatedDate;

    // Default constructor
    SocialMediaAccount() {
        username = "UnknownUser";
        followersCount = 0;
        verified = false;
        accountCreatedDate = "01-01-2020";
    }

    // Parameterized constructor
    SocialMediaAccount(String username, int followersCount, boolean verified, String accountCreatedDate) {
        this.username = username;
        this.followersCount = followersCount;
        this.verified = verified;
        this.accountCreatedDate = accountCreatedDate;
    }

    // Getters and Setters
    String getUsername() { return username; }
    void setUsername(String username) { this.username = username; }

    int getFollowersCount() { return followersCount; }
    void setFollowersCount(int followersCount) { this.followersCount = followersCount; }

    boolean isVerified() { return verified; }
    void setVerified(boolean verified) { this.verified = verified; }

    String getAccountCreatedDate() { return accountCreatedDate; }
    void setAccountCreatedDate(String accountCreatedDate) { this.accountCreatedDate = accountCreatedDate; }

    void display() {
        System.out.println("Username: " + username);
        System.out.println("Followers Count: " + followersCount);
        System.out.println("Verified: " + verified);
        System.out.println("Account Created Date: " + accountCreatedDate);
    }
}

// Derived class 1
class InstagramAccount extends SocialMediaAccount {
    int postsCount;
    int reelsCount;
    boolean professionalAccount;

    InstagramAccount() {
        super();
        postsCount = 100;
        reelsCount = 25;
        professionalAccount = true;
    }

    InstagramAccount(String username, int followersCount, boolean verified, String accountCreatedDate,
                     int postsCount, int reelsCount, boolean professionalAccount) {
        super(username, followersCount, verified, accountCreatedDate);
        this.postsCount = postsCount;
        this.reelsCount = reelsCount;
        this.professionalAccount = professionalAccount;
    }

    void display() {
        System.out.println("---- Instagram Account ----");
        super.display();
        System.out.println("Posts Count: " + postsCount);
        System.out.println("Reels Count: " + reelsCount);
        System.out.println("Professional Account: " + professionalAccount);
    }
}

// Derived class 2
class LinkedInAccount extends SocialMediaAccount {
    String profession;
    int connections;
    boolean openToWork;

    LinkedInAccount() {
        super();
        profession = "Software Engineer";
        connections = 300;
        openToWork = false;
    }

    LinkedInAccount(String username, int followersCount, boolean verified, String accountCreatedDate,
                    String profession, int connections, boolean openToWork) {
        super(username, followersCount, verified, accountCreatedDate);
        this.profession = profession;
        this.connections = connections;
        this.openToWork = openToWork;
    }

    void display() {
        System.out.println("---- LinkedIn Account ----");
        super.display();
        System.out.println("Profession: " + profession);
        System.out.println("Connections: " + connections);
        System.out.println("Open To Work: " + openToWork);
    }
}

// Derived class 3
class YouTubeAccount extends SocialMediaAccount {
    int subscribers;
    int totalVideos;
    String channelCategory;

    YouTubeAccount() {
        super();
        subscribers = 1000;
        totalVideos = 50;
        channelCategory = "Education";
    }

    YouTubeAccount(String username, int followersCount, boolean verified, String accountCreatedDate,
                   int subscribers, int totalVideos, String channelCategory) {
        super(username, followersCount, verified, accountCreatedDate);
        this.subscribers = subscribers;
        this.totalVideos = totalVideos;
        this.channelCategory = channelCategory;
    }

    void display() {
        System.out.println("---- YouTube Account ----");
        super.display();
        System.out.println("Subscribers: " + subscribers);
        System.out.println("Total Videos: " + totalVideos);
        System.out.println("Channel Category: " + channelCategory);
    }
}

// Test class
public class SocialMediaTest {
    public static void main(String[] args) {
        InstagramAccount insta = new InstagramAccount("ayush_123", 5000, true, "12-06-2020", 250, 80, true);
        LinkedInAccount linked = new LinkedInAccount("ayush.lakhapati", 1200, true, "05-03-2019", "Java Developer", 800, true);
        YouTubeAccount yt = new YouTubeAccount("TechWithAyush", 30000, true, "01-01-2018", 30000, 150, "Technology");

        insta.display();
        System.out.println();
        linked.display();
        System.out.println();
        yt.display();
    }
}
