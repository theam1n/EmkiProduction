package com.example.emkiproductionapplication.repository;

import com.example.emkiproductionapplication.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
