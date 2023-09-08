package hostelmanagementsystem.service.custom;

import lk.ijse.hostelmanagementsystem.dto.custom.RoomDTO;
import lk.ijse.hostelmanagementsystem.dto.custom.RoomTypeDTO;
import lk.ijse.hostelmanagementsystem.service.CrudService;
import lk.ijse.hostelmanagementsystem.tm.ReservedOrAvailableRoomTM;
import lk.ijse.hostelmanagementsystem.tm.RoomTM;

import java.util.List;

public interface RoomService extends CrudService<RoomDTO,String> {
    List<RoomDTO> getAvailableRooms(RoomTypeDTO roomType);
    List<RoomTM> getRoomDataToTable();
    List<ReservedOrAvailableRoomTM> getAvailableRooms();
}
