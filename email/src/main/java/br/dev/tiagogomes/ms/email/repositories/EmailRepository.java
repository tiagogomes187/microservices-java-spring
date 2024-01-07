package br.dev.tiagogomes.ms.email.repositories;

import br.dev.tiagogomes.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
