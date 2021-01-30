package no.walseth.mavencourse.mapstruct;

import no.walseth.mavencourse.mapstruct.mappers.UserMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserMapperTest {

    @Test
    public void testUserToUserCommandMapper() {
        User u = new User("tron", "walseth", "tronwa@gmail.com");
        UserCommand cmd = UserMapper.INSTANCE.userToUserCommand(u);
        assertEquals(u.getFirstName(), cmd.getFirstName());
        assertEquals(u.getLastName(), cmd.getLastName());
        assertEquals(u.getEmail(), cmd.getEmail());
    }

    @Test
    public void testUserCommandToUserMapper() {
        UserCommand u = new UserCommand("tron", "walseth", "tronwa@gmail.com");
        User cmd = UserMapper.INSTANCE.userCommandToUser(u);
        assertEquals(u.getFirstName(), cmd.getFirstName());
        assertEquals(u.getLastName(), cmd.getLastName());
        assertEquals(u.getEmail(), cmd.getEmail());

    }
}
