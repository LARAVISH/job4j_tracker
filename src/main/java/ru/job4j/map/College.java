package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class College {

        private final Map<Student, Set<Subject>> students;

        public College(Map<Student, Set<Subject>> students) {
            this.students = students;
        }

        public Optional<Student> findByAccount(String account) {
            Optional<Student> res = Optional.empty();
            for (Student s: students.keySet()) {
                if (account.equals(s.getAccount())) {
                    res = Optional.of(s);
                    break;
                }
            }
            return res;
        }

        public Optional<Subject> findBySubjectName(String account, String name) {
            Optional<Subject> res = Optional.empty();
            Optional<Student> s = findByAccount(account);
            if (s.isPresent()) {
                Set<Subject> subjects = students.get(s.get());
                for (Subject subj : subjects) {
                    if (name.equals(subj.getName())) {
                        res = Optional.of(subj);
                        break;
                    }
                }
            }
            return res;
        }
    }