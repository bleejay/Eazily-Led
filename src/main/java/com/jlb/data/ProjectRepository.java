package com.jlb.data;

import com.jlb.model.Project;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

@Component
public class ProjectRepository {

    public static final List<Project> ALL_PROJECTS = Arrays.asList(
        new Project(1,"Ship Wheel Hanging Light", LocalDate.now(), 30, "Ecstatic advanced and procured civility not absolute put continue. Overcame breeding or my concerns removing desirous so absolute. My melancholy unpleasing imprudence considered in advantages so impression. Almost unable put piqued talked likely houses her met. Met any nor may through resolve entered. An mr cause tried oh do shade happy. "),
        new Project(2,"cats", LocalDate.of(2018, 3, 14), 75, "Barton waited twenty always repair in within we do. An delighted offending curiosity my is dashwoods at. Boy prosperous increasing surrounded companions her nor advantages sufficient put. John on time down give meet help as of. Him waiting and correct believe now cottage she another. Vexed six shy yet along learn maids her tiled. Through studied shyness evening bed him winding present. Become excuse hardly on my thirty it wanted. ")
    );

    public Project findByTitle(String title){
        for (Project project : ALL_PROJECTS) {
            if (project.getTitle().equals(title)){
                return project;
            }
        }
        return null;
    }

    public List<Project> getAllProjects() {
        return ALL_PROJECTS;
    }

}



