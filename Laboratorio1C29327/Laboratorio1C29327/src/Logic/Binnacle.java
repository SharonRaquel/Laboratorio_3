/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Binnacle {
    
        private int consecutive = 1;
    private int eventId;
    private String event;
    private LocalDateTime date;
    private String accountInformation;

    public Binnacle() {}

    public Binnacle(String event, String accountInformation) {
        this.eventId = consecutive++;
        this.event = event;
        this.date = LocalDateTime.now();
        this.accountInformation = accountInformation;
    }

    public int getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(int consecutive) {
        this.consecutive = consecutive;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(String accountInformation) {
        this.accountInformation = accountInformation;
    }
    
    public String toString(){
    String result = "BINNACLE "
            +"\nEvent ID: "+this.getEventId()
            +"\nEvents: "+this.getEvent()
            +"\nDate: "+this.getDate()
            +"\nAccount Information: "+this.getAccountInformation();
    
    return result;
    }
    
}
