package com.example.todoappapi.entity;

public class Todo {

    String title;
    String text;
    String deadline;
    Boolean checked;

    public Todo(String title, String text, String deadline) {
        this.title=title;
        this.text=text;
        this.deadline=deadline;
        this.checked=false;
    }

    //getter
    public String getTitle(){return title;}
    public String getText(){return text;}
    public String getDeadline(){return deadline;}
    public boolean getChecked(){return checked;}

    //setter
    public void setTitle(String title){this.title=title;}
    public void setText(String text){this.text=text;}
    public void setDeadline(String deadLine){this.deadline=deadline;}
    public void setChecked(Boolean checked){this.checked=checked;}


}
