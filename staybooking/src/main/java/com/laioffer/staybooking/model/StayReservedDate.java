package com.laioffer.staybooking.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stay_reserved_date")
public class StayReservedDate implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private StayReservedDateKey id;

    @MapsId("stay_id")
    @ManyToOne
    private Stay stay;

    public StayReservedDate() {}

    public StayReservedDate(StayReservedDateKey id, Stay stay) {
        this.id = id;
        this.stay = stay;
    }

    public StayReservedDateKey getId() {
        return id;
    }

    public StayReservedDate setPrimaryKey(StayReservedDateKey id) {
        this.id = id;
        return this;
    }

    public Stay getStay() {
        return stay;
    }

    public StayReservedDate setStay(Stay stay) {
        this.stay = stay;
        return this;
    }
}
