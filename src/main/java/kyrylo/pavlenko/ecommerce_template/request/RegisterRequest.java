package kyrylo.pavlenko.ecommerce_template.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import kyrylo.pavlenko.ecommerce_template.validation.password.PasswordMatches;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
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
}
