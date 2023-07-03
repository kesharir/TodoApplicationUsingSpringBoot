package com.scaler.todoprojectwithspringboot.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class Task {
    Integer id;
    String name;
    Date dueDate;
    Boolean completed;
}
