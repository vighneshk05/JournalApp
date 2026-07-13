package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;
public interface JournalEntryRepository extends MongoRepository<JournalEntry,ObjectId> {











}
