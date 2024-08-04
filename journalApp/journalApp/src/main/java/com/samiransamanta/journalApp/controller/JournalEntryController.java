package com.samiransamanta.journalApp.controller;

import com.samiransamanta.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntry = new HashMap<>();

    @GetMapping("/get-all")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntry.values());
    }

    @GetMapping("/id/{journalId}")
    public JournalEntry getJournalById(@PathVariable Long journalId){
        return journalEntry.get(journalId);
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry journalData){
        journalEntry.put(journalData.getId(),journalData);
        return true;
    }

    @DeleteMapping("/id/{journalId}")
    public JournalEntry deleteJournalById(@PathVariable Long journalId){
        return journalEntry.remove(journalId);
    }

    @PutMapping("/id/{journalId}")
    public JournalEntry updateJournlaById(@PathVariable Long journalId, @RequestBody JournalEntry data){
        return journalEntry.put(journalId,data);
    }
}
