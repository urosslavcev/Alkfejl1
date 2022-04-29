package hu.alkfejl.model;

import javafx.beans.property.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {
    private IntegerProperty id = new SimpleIntegerProperty(this,"id");
    private StringProperty name = new SimpleStringProperty(this,"name");
    private StringProperty hId = new SimpleStringProperty(this,"hId");
    private IntegerProperty telNum = new SimpleIntegerProperty(this,"telNum");
    private ObjectProperty<LocalDate> dateOfBirth = new SimpleObjectProperty<>(this, "dateOfBirth");
    private BooleanProperty libraryMember = new SimpleBooleanProperty(this,"libraryMember");

}


