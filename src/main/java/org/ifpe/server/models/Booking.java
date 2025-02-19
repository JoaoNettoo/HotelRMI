package org.ifpe.server.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking implements Serializable {

    private Long id;
    private Long roomID;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String guestName;
}