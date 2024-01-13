package org.moduletest;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.ArrayList;



@ToString @EqualsAndHashCode
public class Student {
    @Setter
    @Getter
    private String name;
    private List<Integer> marks=new ArrayList<>();
    public Student(String name)
    {
        this.name=name;
    }
    public void addMark(int mark)
    {
        if (mark <2||mark>5)       throw new IllegalArgumentException("Error mask:"+mark);

        marks.add(mark);
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
