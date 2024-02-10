package org.gfg.minor1.request;

import lombok.*;
import org.gfg.minor1.model.Student;
import org.gfg.minor1.model.StudentType;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentCreateRequest {
    private String name;
    private String email;
    private String phoneNo;
    private String address;

    public Student toStudent() {
            return Student.builder().
                    name(this.name).
                    email(this.email).
                    phoneNo(this.phoneNo).
                    address(this.address).
                    status(StudentType.ACTIVE).
                    build();
    }
}
