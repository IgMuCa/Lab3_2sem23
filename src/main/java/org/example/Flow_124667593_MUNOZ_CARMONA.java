package org.example;

import java.util.List;

public class Flow_124667593_MUNOZ_CARMONA {
    private int id;
    private String name_msg;
    private List<Option_124667593_MUNOZ_CARMONA> options;


    public Flow_124667593_MUNOZ_CARMONA(int id, String name_msg, List<Option_124667593_MUNOZ_CARMONA> options) {
        this.id = id;
        this.name_msg = name_msg;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public String getName_msg() {
        return name_msg;
    }

    public List<Option_124667593_MUNOZ_CARMONA> getOptions() {
        return options;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName_msg(String name_msg) {
        this.name_msg = name_msg;
    }

    //Modificador del flujo
    public void setOptions(List<Option_124667593_MUNOZ_CARMONA> options) {
        this.options = options;
    }
}
