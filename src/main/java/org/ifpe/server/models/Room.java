package org.ifpe.server.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room implements Serializable {

    private Long id;
    private String type;
    private Double price;
    private Boolean available;
}