package liskovsubstitution;

/**
 * It applies to inheritance in such way that derived class must be
 * completely substitutable for base class.
 * If class A is subtype of Class B then we should able to replace B with A
 * without interrupting behaviour of program.
 * The LSP governs relationships between parent and child classes 
 * (i.e. hierarchical relationships). 
 * It tells you how to implement an API.
 */
public abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract  void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract  void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract  void groupVideoCall(String... users);
}

