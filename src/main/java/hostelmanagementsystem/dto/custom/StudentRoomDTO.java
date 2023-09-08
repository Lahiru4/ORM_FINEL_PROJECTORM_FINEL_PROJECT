package hostelmanagementsystem.dto.custom;

import lk.ijse.hostelmanagementsystem.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRoomDTO implements SuperDTO {
    private String id;
    private double advance;
    private LocalDate paymentDate;
    private LocalDate from;
    private LocalDate to;
    private StudentDTO studentDTO;
    private RoomDTO roomDTO;
}
