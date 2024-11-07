package com.example.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

// Adding annotation
// to our Dao class
@androidx.room.Dao
public interface Dao {

    @Insert
    void insert (CourseModel model);

    @Update
    void update (CourseModel model);

    @Delete
    void delete (CourseModel model);

    // delete all courses from our database.
    @Query("DELETE FROM course_table")
    void deleteAllCourses();

    // in this we are ordering our courses in ascending order
    @Query("SELECT * FROM course_table ORDER BY courseName ASC")
    LiveData<List<CourseModel>> getAllCourses();
}
