package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    public void init() {
        user = User.builder()
                .name("Markiyan")
                .age(18)
                .gender(Gender.MALE)
                .weight(75)
                .height(175)
                .occupation("Student")
                .occupation("InternationalSuperStar")
                .build();
    }

    @Test
    public void testUser() {
        assertEquals(user.toString(),
                "User(gender=MALE, weight=75.0, height=175.0, occupations=[Student, InternationalSuperStar])");
    }
}
