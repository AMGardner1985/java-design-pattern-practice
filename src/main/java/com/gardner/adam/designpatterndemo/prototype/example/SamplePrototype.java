package com.gardner.adam.designpatterndemo.prototype.example;

import java.util.List;

public class SamplePrototype implements Cloneable {
    private String sql;
    private List<String> parameters;
    private Record record;

    public SamplePrototype(String sql, List<String> parameters, Record record){
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public SamplePrototype clone(){ // shallow clone
        try {
            return (SamplePrototype) super.clone(); // calls parent (clonable)
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getParameters(){
        return parameters;
    }

    public String getSql() {
        return sql;
    }

    public Record getRecord() {
        return record;
    }
}

