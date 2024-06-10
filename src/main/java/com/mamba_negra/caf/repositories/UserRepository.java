package com.mamba_negra.caf.repositories;

import com.mamba_negra.caf.entities.UserEntity;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, BigInteger> {
    Optional<UserEntity> findByEmail(String email);
}
