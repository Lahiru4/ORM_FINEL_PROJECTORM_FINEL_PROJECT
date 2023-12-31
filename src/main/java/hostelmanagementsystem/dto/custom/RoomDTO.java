package hostelmanagementsystem.dto.custom;

import lk.ijse.hostelmanagementsystem.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO implements SuperDTO {
    private String id;
    private String availability;
    private RoomTypeDTO roomType;
    private List<StudentRoomDTO> studentRoomDTOList;
}
