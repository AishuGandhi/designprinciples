package liskovsubstitution;

/**
 * Cannot substitute of Social Media as both are not in a sync
 */
public class Whatsapp extends SocialMedia {
    public void chatWithFriend() {

    }

    public void publishPost(Object post) {
        //Feature Not applicable like insta
    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}
