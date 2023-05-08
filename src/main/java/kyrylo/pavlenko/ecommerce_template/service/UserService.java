package kyrylo.pavlenko.ecommerce_template.service;

import kyrylo.pavlenko.ecommerce_template.dto.UserRegistrationDto;
import kyrylo.pavlenko.ecommerce_template.model.User;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
