package hr.tvz.miholic.hardwareapp.Repository;

import hr.tvz.miholic.hardwareapp.Classes.Hardware;

import java.util.List;
import java.util.Optional;

public interface HardwareRepository {

    List<Hardware> findAll();

    Optional<Hardware> findByCode(String code);
}
