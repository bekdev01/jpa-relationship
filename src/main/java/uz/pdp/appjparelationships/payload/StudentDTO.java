package uz.pdp.appjparelationships.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String firstName;

    private String lastName;

    private Integer addressId;

    private Integer groupId;
}
