package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component public class UserService {

//    @PutMapping("id/{id}")

    @Autowired
    private UserRepository userRepository;




    public void saveEntry (User user){
        userRepository.save(user);
    }
    public List<User> getAll (){
        return userRepository.findAll();
    }


//    public JournalEntry updateJournalEntryById(@PathVariable Long id,
//                                               @RequestBody JournalEntry myEntry) {
//        return null;
//
//    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);

    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }
}
