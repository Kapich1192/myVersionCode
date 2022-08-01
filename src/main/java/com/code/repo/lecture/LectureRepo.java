package com.code.repo.lecture;

import com.code.models.lecture.Lecture;
import org.springframework.data.repository.CrudRepository;

public interface LectureRepo extends CrudRepository<Lecture, Long> {
}
