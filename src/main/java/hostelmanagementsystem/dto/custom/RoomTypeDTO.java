package hostelmanagementsystem.dto.custom;

import lk.ijse.hostelmanagementsystem.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeDTO  implements SuperDTO {
    private String id;
    private String description;
    private double price;
    private List<RoomDTO> roomDTOS;
}
