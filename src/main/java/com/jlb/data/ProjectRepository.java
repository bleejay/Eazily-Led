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
        new Project(2,"Cats", LocalDate.of(2018, 3, 14), 75, "Barton waited twenty always repair in within we do. An delighted offending curiosity my is dashwoods at. Boy prosperous increasing surrounded companions her nor advantages sufficient put. John on time down give meet help as of. Him waiting and correct believe now cottage she another. Vexed six shy yet along learn maids her tiled. Through studied shyness evening bed him winding present. Become excuse hardly on my thirty it wanted. "),
        new Project(3, "Lightss", LocalDate.of(2017, 11, 16), 14, "Unfeeling so rapturous discovery he exquisite. Reasonably so middletons or impression by terminated. Old pleasure required removing elegance him had. Down she bore sing saw calm high. Of an or game gate west face shed. \uFEFFno great but music too old found arose. "),
        new Project(4, "Whats This", LocalDate.of(2017, 8, 12), 24, "Of friendship on inhabiting diminution discovered as. Did friendly eat breeding building few nor. Object he barton no effect played valley afford. Period so to oppose we little seeing or branch. Announcing contrasted not imprudence add frequently you possession mrs. Period saw his houses square and misery. Hour had held lain give yet. ")
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



