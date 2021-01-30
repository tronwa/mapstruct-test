package no.walseth.mavencourse.mapstruct.mappers;

import no.walseth.mavencourse.mapstruct.User;
import no.walseth.mavencourse.mapstruct.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User src);
    User userCommandToUser(UserCommand userCmd);
}
