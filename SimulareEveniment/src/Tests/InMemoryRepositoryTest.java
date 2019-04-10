package Tests;

import Domain.Event;
import Domain.EventValidator;
import Domain.IValidator;
import Repository.IRepository;
import Repository.InMemoryRepository;
import Service.EventService;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

class InMemoryRepositoryTest extends InMemoryRepository {

    Event A = new Event(1,"AAA","bbb","120","10:00");
    IValidator<Event> eventValidator = new EventValidator();
    IRepository<Event> eventRepository = new InMemoryRepository<>(EventValidator);
    EventService receiptService = new EventService();

    @org.junit.jupiter.api.Test
    void findById() {
        eventRepository.upsert(A);
        assertEquals(A,eventRepository.findById(1));
    }

    @org.junit.jupiter.api.Test
    void upsert() {
        eventRepository.upsert(A);
        assertEquals(A,eventRepository.findById(1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        eventRepository.upsert(A);
        eventRepository.remove(1);
        assertEquals(null,eventRepository.findById(1));
    }

    @org.junit.jupiter.api.Test
    public ArrayList getAll() {
        assertEquals(true,eventRepository.getAll().isEmpty());
        return null;
    }
}