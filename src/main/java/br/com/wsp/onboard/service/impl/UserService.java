package br.com.wsp.onboard.service.impl;

import br.com.wsp.onboard.dto.UserDto;
import br.com.wsp.onboard.model.User;
import br.com.wsp.onboard.repository.UserRepository;
import br.com.wsp.onboard.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    @Override
    public UserDto save(UserDto userDto) {

        User user = new User();
        return null;
    }
}
