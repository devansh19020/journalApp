package net.magikarp.journalApp.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
// @Getter
// @Setter
// @AllArgsConstructor
// @ToString
// @EqualsAndHashCode
// @Builder
@Document(collection="journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;
}
