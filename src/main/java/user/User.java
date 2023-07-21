package user;

import common.BaseEntity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Data
@EqualsAndHashCode (callSuper = true)
@ToString (callSuper = true)
public class User extends BaseEntity<UUID> {
    private String name;
    private String surname;
    private double balance;
    private String phoneNumber;
    private String password;
    private Role role;
    private LocalDate employeeDate;
    private double salary;
    private UUID restaurantId;

    @Builder
    public User(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy,
                String name, String surname, double balance, String phoneNumber, String password, Role role,
                LocalDate employeeDate, double salary, UUID restaurantId) {
        super(id, created, modified, createdBy, modifiedBy);
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.employeeDate = employeeDate;
        this.salary = salary;
        this.restaurantId = restaurantId;
    }
}
