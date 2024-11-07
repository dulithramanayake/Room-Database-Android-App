package com.example.roomdatabase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {

    // creating a new variable for course repository.
    private CourseRepository repository;
    // below line is to create a variable for live
    // data where all the courses are present.
    private LiveData<List<CourseModel>> allCourses;

    // constructor for our view modal.
    public ViewModel(@NonNull Application application) {
        super(application);
        repository = new CourseRepository(application);
        allCourses = repository.getAllCourses();
    }

    // below method is use to insert the data to our repository.
    public void insert(CourseModel model){
        repository.insert(model);
    }

    public void update(CourseModel model) {
        repository.update(model);
    }

    // below line is to delete the data in our repository.
    public void delete(CourseModel model) {
        repository.delete(model);
    }

    // below method is to delete all the courses in our list.
    public void deleteAllCourses() {
        repository.deleteAllCourses();
    }

    // below method is to get all the courses in our list.
    public LiveData<List<CourseModel>> getAllCourses() {
        return allCourses;
    }
}
