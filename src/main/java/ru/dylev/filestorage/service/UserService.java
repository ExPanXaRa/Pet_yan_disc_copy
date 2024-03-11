package ru.dylev.filestorage.service;

import ru.dylev.filestorage.dto.user.UserRequestDto;
import ru.dylev.filestorage.dto.user.UserResponseDto;

/**
 * Defines methods to interact with {@link ru.dylev.filestorage.entity.User} objects.
 */
public interface UserService {

    UserResponseDto findByEmail(String email);
    UserResponseDto findById(Long id);
    UserResponseDto create(UserRequestDto userRequestDto);
    UserResponseDto updateProfile(UserRequestDto userRequestDto);
    UserResponseDto updatePassword(UserRequestDto userRequestDto);
}
