package UI;

import Domain.Event;
import Service.EventService;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    public TableColumn colEvent;
    public TableView<Event> tblEvent;
    public TableColumn colEventId;
    public TableColumn colEventName;
    public TableColumn colEventDay;
    public TableColumn colEventDuration;
    public TableColumn colEventStartTime;
    public TextField txtEventId;
    public TextField txtEventName;
    public TextField txtEventDay;
    public TextField txtEventDuration;
    public TextField txtEventStartTime;
    public Button btnAddevent;

    private EventService eventService;
    private ObservableList<Event> event = FXCollections.observableArrayList();

    public void setServices(EventService eventService) {
        this.eventService = eventService;
    }

    @FXML
    private void initialize() {

        Platform.runLater(() -> {
            event.addAll(eventService.getAll());
            tblEvent.setItems(event);
        });
    }

    public void btnAddAndUpdateEventClick(ActionEvent actionEvent) {
        try {
            int id = Integer.parseInt(txtEventId.getText());
            String name = txtEventName.getText();
            String day = txtEventDay.getText();
            String duration = txtEventDuration.getText();
            String startTime = txtEventStartTime.getText();

            eventService.addEvent(id, name, day, duration, startTime);

            event.clear();
            event.addAll(eventService.getAll());
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }

    public void btnGetAllReceiptClick(ActionEvent actionEvent) {
        try {
            int id = Integer.parseInt(txtEventId.getText());
            String name = txtEventName.getText();
            String day = txtEventDay.getText();
            String duration = txtEventDuration.getText();
            String startTime = txtEventStartTime.getText();

            eventService.getAll();

            event.clear();
            event.addAll(eventService.getAll());
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }
}
