package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Component public class JournalEntryService {

//    @PutMapping("id/{id}")

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry (JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }
    public List<JournalEntry> getAll (){
       return journalEntryRepository.findAll();
    }


    public JournalEntry updateJournalEntryById(@PathVariable Long id,
                                               @RequestBody JournalEntry myEntry) {
        return null;

    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);

    }

    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
}
