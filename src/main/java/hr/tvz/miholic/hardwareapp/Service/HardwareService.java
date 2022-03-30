package hr.tvz.miholic.hardwareapp.Service;

import hr.tvz.miholic.hardwareapp.Classes.HardwareDTO;

import java.util.List;

public interface HardwareService {
    List<HardwareDTO> findAll();

    HardwareDTO findByCode(String JMBAG);
}
