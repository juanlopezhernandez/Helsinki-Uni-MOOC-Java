
public class Main {

    public static void main(String[] args) {
        MessagingService ms = new MessagingService();
        ms.add(new Message("juan","hfjklhasdkfdeeho"));
        System.out.println(ms.getMessages());
        ms.add(new Message ("andrew", "hahfhasdfiasdf"));
        System.out.println(ms.getMessages());
    }
}
