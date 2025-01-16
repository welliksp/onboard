package br.com.wsp.onboard.service;

import br.com.wsp.onboard.dto.UserDto;

public interface IUserService {

    UserDto save(UserDto userDto);
}