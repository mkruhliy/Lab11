package task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Markiyan")
                .age(18)
                .gender(Gender.MALE)
                .weight(75)
                .height(175)
                .occupation("Student")
                .occupation("InternationalSuperStar")
                .build();
        System.out.println(user);
    }
}
