package net.magikarp.journalApp.controller;


import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.magikarp.journalApp.entity.JournalEntry;
import net.magikarp.journalApp.service.JournalEntryService;



@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping                   //If no path specified then called from class path(if only single request of each type)
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }
    
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId) {
        return journalEntryService.findById(myId).orElse(null);
    }
    
    @DeleteMapping("id/{myId}")
    public boolean  deleteJournalEntryById(@PathVariable ObjectId myId) {
        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId myId, @RequestBody JournalEntry myEntry) {
        JournalEntry old = journalEntryService.findById(myId).orElse(null);
        if(old != null){
            old.setTitle(myEntry.getTitle()!=null && !myEntry.getTitle().equals("") ? myEntry.getTitle() : old.getTitle());
            old.setContent(myEntry.getContent()!=null && !myEntry.getContent().equals("") ? myEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
}
