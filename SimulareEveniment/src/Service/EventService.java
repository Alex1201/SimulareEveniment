package Service;

import Domain.Event;
import Domain.IValidator;
import Repository.IRepository;

import java.util.ArrayList;

public class EventService implements IValidator<Event> {

    private IRepository<Event> repository;

    public EventService() {
        this.repository = repository;
    }

    /**
     * Add an event in repository
     * @param id
     * @param name
     * @param day
     * @param duration
     * @param startTime
     */
    public void addEvent(int id,String name, String day,String duration, String startTime){
        for (Event c : repository.getAll())
            if (c.getId() == id)
                throw new ServiceException("An event with the same ID already exists.");

        repository.upsert(new Event(id,name,day,duration,startTime));
    }

    /**
     * Show a list of all events
     * @return
     */
    public ArrayList<Event> getAll(){
        return repository.getAll();
    }

    @Override
    public void validate(Event entity) {

    }
}
