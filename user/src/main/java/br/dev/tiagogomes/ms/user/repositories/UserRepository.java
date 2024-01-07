package br.dev.tiagogomes.ms.user.repositories;

import br.dev.tiagogomes.ms.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
