package br.com.wsp.onboard.service.impl;

import br.com.wsp.onboard.dto.UserDto;
import br.com.wsp.onboard.repository.UserRepository;
import br.com.wsp.onboard.service.IUserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    IUserService service;

    @Mock
    UserRepository userRepository;

    @Mock
    UserDto userDto;

    @Test
    @DisplayName("TESTE CRIACAO DE USUÁRIO")
    void save() {

        doReturn(userDto).when(service).save(any());

        UserDto result = service.save(userDto);


    }
}