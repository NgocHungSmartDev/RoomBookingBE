package com.virtualpairprogrammers.roombooking.model.entities;

import com.virtualpairprogrammers.roombooking.model.Layout;

import javax.persistence.*;

@Entity
@Table(name = "layoutcapacity")
public class LayoutCapacity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Layout layout;
    private Integer capacity;

    public LayoutCapacity() {}

    public LayoutCapacity(Layout layout, Integer capacity) {
        this.layout = layout;
        this.capacity = capacity;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
