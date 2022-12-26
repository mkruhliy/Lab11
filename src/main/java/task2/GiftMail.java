package task2;

public class GiftMail implements MailCode{
    private static final String TEMPLATE = "Black Friday! %NAME recieve your discount right now!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
