package hu.alkfejl.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Student {
    private IntegerProperty id = new SimpleIntegerProperty(this,"id");
    private StringProperty name = new SimpleStringProperty(this,"name");
    private StringProperty hId = new SimpleStringProperty(this,"hId");
    private IntegerProperty telNum = new SimpleIntegerProperty(this,"telNum");
    private ObjectProperty<LocalDate> dateOfBirth = new SimpleObjectProperty<>(this, "dateOfBirth");
    private BooleanProperty libraryMember = new SimpleBooleanProperty(this,"libraryMember");

    public Student(IntegerProperty id, StringProperty name, StringProperty hId, IntegerProperty telNum, ObjectProperty<LocalDate> dateOfBirth, BooleanProperty libraryMember) {
        this.id = id;
        this.name = name;
        this.hId = hId;
        this.telNum = telNum;
        this.dateOfBirth = dateOfBirth;
        this.libraryMember = libraryMember;
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String gethId() {
        return hId.get();
    }

    public StringProperty hIdProperty() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId.set(hId);
    }

    public int getTelNum() {
        return telNum.get();
    }

    public IntegerProperty telNumProperty() {
        return telNum;
    }

    public void setTelNum(int telNum) {
        this.telNum.set(telNum);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth.get();
    }

    public ObjectProperty<LocalDate> dateOfBirthProperty() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth.set(dateOfBirth);
    }

    public boolean isLibraryMember() {
        return libraryMember.get();
    }

    public BooleanProperty libraryMemberProperty() {
        return libraryMember;
    }

    public void setLibraryMember(boolean libraryMember) {
        this.libraryMember.set(libraryMember);
    }
}


