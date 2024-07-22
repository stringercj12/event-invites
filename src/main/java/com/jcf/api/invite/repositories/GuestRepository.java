package com.jcf.api.invite.repositories;

import com.jcf.api.invite.domain.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GuestRepository extends JpaRepository<Guest, UUID> {
}
