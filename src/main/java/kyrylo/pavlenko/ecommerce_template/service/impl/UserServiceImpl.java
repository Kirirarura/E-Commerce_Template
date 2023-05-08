package kyrylo.pavlenko.ecommerce_template.service.impl;

import kyrylo.pavlenko.ecommerce_template.dto.UserRegistrationDto;
import kyrylo.pavlenko.ecommerce_template.model.User;
import kyrylo.pavlenko.ecommerce_template.repository.UserRepository;
import kyrylo.pavlenko.ecommerce_template.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
//        if (emailExists(userRegistrationDto.getEmail())){
//            throw new UserAlreadyExistException("Account with such email address: "
//                    + userRegistrationDto.getEmail() + " already exists");
//        }
//        User user = new User.builder()
//                .setFirstName(userRegistrationDto.getFirstName())
//                .setLastName(userRegistrationDto.getLastName())
//                .setEmail(userRegistrationDto.getEmail())
//                .setPassword(passwordEncoder.encode(userRegistrationDto.getPassword()))
//                .setRoles(List.of(new Role("ROLE_USER")))
//                .build();
//        userRepository.save(user);
        throw new UnsupportedOperationException();

    }

    private boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
