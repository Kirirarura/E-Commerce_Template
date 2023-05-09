package kyrylo.pavlenko.ecommerce_template.service.impl;


import kyrylo.pavlenko.ecommerce_template.user.UserRepository;
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

}
