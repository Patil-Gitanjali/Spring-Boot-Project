package com.marvellous.MarvellousFullStack.Entity;


import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")
@Getter
@Setter
public class BatchEntry
{
    private ObjectId id;
    private String name;
    private  int fees;

    public Object getFees() {
        return null;
    }

    public void setFess(Object fees) {
    }

    public Object getName() {
        return null;
    }

    public void setName(Object name) {

    }
}
