package Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EventValidator implements IValidator<Event>{

    @Override
    public void validate(Event event) {

        SimpleDateFormat formatDate = new SimpleDateFormat("dd.mm.yyyy");

        String error = "";
        try{
            formatDate.parse(event.getDate());
        } catch (ParseException pe){
            error += "The date format is incorrect. Use dd.mm.yyyy";
        }

        if (event.getId() <= 0)
            throw new RuntimeException("The id must be positive.");
    }
}
