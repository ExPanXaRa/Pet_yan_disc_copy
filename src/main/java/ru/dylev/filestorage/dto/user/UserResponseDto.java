package ru.dylev.filestorage.dto.user;

import lombok.Data;
import ru.dylev.filestorage.entity.Role;

import java.io.Serializable;
import java.util.Set;

/**
 * Class represents {@link ru.dylev.filestorage.entity.User} data, which is sent with HTTP request.
 */
@Data
public class UserResponseDto implements Serializable {

    private Long id;

    private String email;

    private String firstname;

    private String lastname;

    private Set<Role> roles;
}
