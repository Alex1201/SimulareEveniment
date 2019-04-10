package Tests;

import Domain.Event;
import Domain.IValidator;
import Repository.IRepository;
import Repository.InMemoryRepository;
import Service.EventService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

class EventServiceTest extends EventService {

    IValidator<Event> eventValidator = new EventService();
    IRepository<Event> eventRepository = new InMemoryRepository<>(eventValidator);
    EventService eventService = new EventService();

    public EventServiceTest(IRepository<Event> repository) {
        super();
    }

    @Test
    void addEvent() {
        eventService.addEvent(1,"aaa","bbb","50","11:00");
        assertEquals(false,eventService.getAll().isEmpty());
    }

    @Test
    public ArrayList<Event> getAll() {
        assertEquals(true,eventService.getAll().isEmpty());
        return null;
    }
}