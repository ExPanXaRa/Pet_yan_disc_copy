package ru.dylev.filestorage.dto.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class DirectoryNameValidator implements ConstraintValidator<ValidDirectoryName, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.isEmpty() && !s.equals(".") && !s.equals("..");
    }
}
