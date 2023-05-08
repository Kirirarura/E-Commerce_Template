package kyrylo.pavlenko.ecommerce_template.validation.password;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import kyrylo.pavlenko.ecommerce_template.dto.UserRegistrationDto;


// todo Fix the problem with password matching validation
public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        UserRegistrationDto user = (UserRegistrationDto) o;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
