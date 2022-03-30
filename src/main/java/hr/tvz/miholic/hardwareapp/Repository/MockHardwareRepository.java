package hr.tvz.miholic.hardwareapp.Repository;

import hr.tvz.miholic.hardwareapp.Classes.Hardware;
import hr.tvz.miholic.hardwareapp.Enums.HardwareTypeEnum;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class MockHardwareRepository implements HardwareRepository {

    private final List<Hardware> MOCKED_HARDWARE = new ArrayList<>(
            Arrays.asList(
                    new Hardware("i5 9500", "123456789", 2000.55, HardwareTypeEnum.CPU, 5),
                    new Hardware("Nvidia GeForce GTX 1650 OC", "123123123231321", 10000.99, HardwareTypeEnum.GPU, 0)
            )
    );

    @Override
    public List<Hardware> findAll() {
        return MOCKED_HARDWARE;
    }

    @Override
    public Optional<Hardware> findByCode(String code) {
        return MOCKED_HARDWARE.stream().filter(it -> Objects.equals(it.getCode(), code)).findAny();
    }
}
