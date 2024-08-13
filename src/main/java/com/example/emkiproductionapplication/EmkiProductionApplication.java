package com.example.emkiproductionapplication;

import com.example.emkiproductionapplication.model.Announcement;
import com.example.emkiproductionapplication.model.AnnouncementTranslation;
import com.example.emkiproductionapplication.model.MainModelWithPage;
import com.example.emkiproductionapplication.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Collections;

@SpringBootApplication
@RequiredArgsConstructor
public class EmkiProductionApplication implements CommandLineRunner {

    private final AboutRepository aboutRepository;
    private final AnnouncementRepository announcementRepository;
    private final AnnouncementTranslationRepository announcementTranslationRepository;
    private final MainModelWithPageRepository mainModelWithPageRepository;
    private final PostTranslationRepository postTranslationRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmkiProductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        if (announcementRepository.findAll().isEmpty()) {
            Announcement announcement = Announcement.builder()
                    .id(36L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.of(2022, 3, 26, 20, 0))
                    .hours("20:30")
                    .created(LocalDateTime.MIN)
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement);

            Announcement announcement1 = Announcement.builder()
                    .id(37L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.parse("2023-07-10T20:00:00"))
                    .hours("20:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement1);

            // Save Announcement 2
            Announcement announcement2 = Announcement.builder()
                    .id(38L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.parse("2023-04-01T20:00:00"))
                    .hours("20:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)

                    .build();

            announcementRepository.save(announcement2);

            // Save Announcement 3
            Announcement announcement3 = Announcement.builder()
                    .id(41L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.parse("2023-10-14T20:00:00"))
                    .hours("20:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement3);

            // Save Announcement 4
            Announcement announcement4 = Announcement.builder()
                    .id(42L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.parse("2024-04-06T16:00:00"))
                    .hours("21:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement4);

            // Save Announcement 5
            Announcement announcement5 = Announcement.builder()
                    .id(45L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.parse("2024-02-10T20:00:00"))
                    .hours("21:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement5);

            Announcement announcement6 = Announcement.builder()
                    .id(48L)
                    .minPrice(1000.0)
                    .maxPrice(1000.0)
                    .date(LocalDateTime.parse("2024-04-07T12:00:00"))
                    .hours("21:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement6);

            // Save Announcement 2
            Announcement announcement7 = Announcement.builder()
                    .id(52L)
                    .minPrice(50.0)
                    .maxPrice(205.0)
                    .date(LocalDateTime.parse("2024-06-08T20:00:00"))
                    .hours("21:45")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement7);

            // Save Announcement 3
            Announcement announcement8 = Announcement.builder()
                    .id(53L)
                    .minPrice(49.0)
                    .maxPrice(199.0)
                    .date(LocalDateTime.parse("2024-10-20T20:00:00"))
                    .hours("21:30")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(null)
                    .build();

            announcementRepository.save(announcement8);

        }

        if (mainModelWithPageRepository.findAll().isEmpty()) {
            MainModelWithPage mainModelWithPage1 = MainModelWithPage.builder()
                    .id(5L)
                    .title("Azərbaycan")
                    .code("AZ")
                    .created(LocalDateTime.parse("0001-01-01T00:00:00"))
                    .lastModified(LocalDateTime.parse("2024-07-14T13:21:08.1937266"))
                    .build();
            mainModelWithPageRepository.save(mainModelWithPage1);

            MainModelWithPage mainModelWithPage2 = MainModelWithPage.builder()
                    .id(6L)
                    .title("İngilis")
                    .code("EN")
                    .created(LocalDateTime.parse("2023-10-19T06:47:07.2002823"))
                    .lastModified(null)
                    .build();
            mainModelWithPageRepository.save(mainModelWithPage2);

            MainModelWithPage mainModelWithPage3 = MainModelWithPage.builder()
                    .id(7L)
                    .title("Rus")
                    .code("RU")
                    .created(LocalDateTime.parse("2023-10-19T06:47:13.5329255"))
                    .lastModified(null)
                    .build();
            mainModelWithPageRepository.save(mainModelWithPage3);
        }




    }
}
