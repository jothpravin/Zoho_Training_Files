-- Insert data into students table
INSERT INTO students (first_name, last_name, date_of_birth, gender, address)
VALUES
    ('Jothi', 'Kumar', '1995-05-15', 'F', '123 Main St'),
    ('Harish', 'Karthick', '1990-08-22', 'M', '456 Oak St'),
    ('Muthu', 'Kalyan', '1998-03-10', 'M', '789 Pine St');

-- Insert data into teachers table
INSERT INTO teachers (first_name, last_name, date_of_birth, gender, subject_taught)
VALUES
    ('John', 'Smith', '1980-02-28', 'M', 'Mathematics'),
    ('Jane', 'Doe', '1975-11-10', 'F', 'Science'),
    ('Robert', 'Johnson', '1985-09-05', 'M', 'English');

-- Insert data into attendance table
INSERT INTO attendance (student_id, class_date, status)
VALUES
    (1, '2023-01-10', 'P'),
    (2, '2023-01-10', 'A'),
    (3, '2023-01-10', 'P');

-- Insert data into subjects table
INSERT INTO subjects (subject_name)
VALUES
    ('Mathematics'),
    ('Science'),
    ('English');

-- Insert data into marks table
INSERT INTO marks (student_id, subject_id, marks)
VALUES
    (1, 1, 90),
    (1, 2, 85),
    (2, 1, 75);

-- Insert data into classes table
INSERT INTO classes (class_name)
VALUES
    ('Class A'),
    ('Class B'),
    ('Class C');

-- Insert data into sections table
INSERT INTO sections (section_name)
VALUES
    ('Section X'),
    ('Section Y'),
    ('Section Z');

-- Insert data into student_class_section_mapping table
INSERT INTO student_class_section_mapping (student_id, class_id, section_id)
VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 3);

-- Insert data into teacher_student_mapping table
INSERT INTO teacher_student_mapping (teacher_id, student_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3);

-- Insert data into teacher_class_section_mapping table
INSERT INTO teacher_class_section_mapping (teacher_id, class_id, section_id)
VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 3);

-- Insert data into student_subject_marks_mapping table
INSERT INTO student_subject_marks_mapping (student_id, subject_id, marks)
VALUES
    (1, 1, 90),
    (1, 2, 85),
    (2, 1, 75);

