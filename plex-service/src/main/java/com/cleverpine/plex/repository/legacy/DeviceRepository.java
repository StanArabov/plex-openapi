package com.cleverpine.plex.repository.legacy;

import com.cleverpine.plex.entity.legacy.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
