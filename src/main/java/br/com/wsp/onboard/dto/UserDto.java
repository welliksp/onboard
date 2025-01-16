package br.com.wsp.onboard.dto;

import java.time.LocalDateTime;

public record UserDto(String firstName, String lastName, LocalDateTime birthdate, String email) {
}
