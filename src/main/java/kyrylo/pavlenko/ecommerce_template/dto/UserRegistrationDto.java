package kyrylo.pavlenko.ecommerce_template.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import kyrylo.pavlenko.ecommerce_template.validation.password.PasswordMatches;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@PasswordMatches
public class UserRegistrationDto {
    @NotNull
    @NotEmpty(message = "Firstname field mustn't be empty")
    private String firstName;
    @NotNull
    @NotEmpty(message = "Lastname field mustn't be empty")
    private String lastName;
    @NotNull
    @NotEmpty(message = "Password field mustn't be empty")
    private String password;
    @NotNull
    @NotEmpty(message = "Repeat password field mustn't be empty")
    private String matchingPassword;
    @NotNull
    @NotEmpty(message = "Email field mustn't be empty")
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegistrationDto that = (UserRegistrationDto) o;
        return Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getPassword());
    }

    @Override
    public String toString() {
        return "UserRegistrationDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
