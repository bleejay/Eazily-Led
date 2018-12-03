package com.jlb.data;

import com.jlb.model.Project;
import org.springframework.stereotype.Component;

import java.io.*;
import java.security.AllPermission;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectRepository {

    public static final List<Project> ALL_PROJECTS = streamReader("C:\\Users\\jason\\IdeaProjects\\EazilyLed\\src\\main\\resources\\Projects.csv");

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

    private static List<Project> streamReader(String Path){

        List<Project> initialList = new ArrayList<>();
        String csvSplitBy = ",";

        try {
        BufferedReader reader = new BufferedReader(new FileReader(Path));

        reader.lines()
                .skip(1)
                .map(line -> line.split(csvSplitBy))
                .forEach(project ->{
                    Project newProject = new Project(Integer.parseInt(project[0]), project[1], toDate(project[2]), Integer.parseInt(project[3]), project[4], project[5]);
                    initialList.add(newProject);
                });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
                return initialList;

    }

//    private static List<Project> readFile(String path){
//        String line;
//        String csvSplitBy = ",";
//        List<Project> initialList = new ArrayList<>();
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(path));
//
//            reader.readLine();
//
//            while ((line = reader.readLine()) !=null){
//                String[] project = line.split(csvSplitBy);
//                Project newProject = new Project(Integer.parseInt(project[0]), project[1], toDate(project[2]), Integer.parseInt(project[3]), project[4], project[5]);
//                initialList.add(newProject);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return initialList;
//
//    }

    private static LocalDate toDate(String dateToChange){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return LocalDate.parse(dateToChange, formatter);
    }

}



