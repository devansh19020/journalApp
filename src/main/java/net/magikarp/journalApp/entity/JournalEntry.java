package net.magikarp.journalApp.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @ToString
// @EqualsAndHashCode
// @Builder
@Document(collection="journal_entries")
@Data
public class JournalEntry {
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;
}
