package org.nic.jec.repository;

import org.nic.jec.entity.M_userroles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<M_userroles, String> {
}
