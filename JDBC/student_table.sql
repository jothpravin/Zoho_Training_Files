-- Table for storing information about students
CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    gender CHAR(1),
    address VARCHAR(255)
    -- Add other relevant fields as needed
);

-- Table for storing information about teachers
CREATE TABLE teachers (
    teacher_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    gender CHAR(1),
    subject_taught VARCHAR(100)
    -- Add other relevant fields as needed
);

-- Table for storing information about student attendance
CREATE TABLE attendance (
    attendance_id SERIAL PRIMARY KEY,
    student_id INTEGER REFERENCES students(student_id),
    class_date DATE,
    status CHAR(1) CHECK (status IN ('P', 'A')) -- 'P' for present, 'A' for absent
    -- Add other relevant fields as needed
);

-- Table for storing information about subjects
CREATE TABLE subjects (
    subject_id SERIAL PRIMARY KEY,
    subject_name VARCHAR(100) NOT NULL
    -- Add other relevant fields as needed
);

-- Table for storing information about student marks
CREATE TABLE marks (
    marks_id SERIAL PRIMARY KEY,
    student_id INTEGER REFERENCES students(student_id),
    subject_id INTEGER REFERENCES subjects(subject_id),
    marks INTEGER
    -- Add other relevant fields as needed
);

-- Table for storing information about student classes
CREATE TABLE classes (
    class_id SERIAL PRIMARY KEY,
    class_name VARCHAR(50) NOT NULL
    -- Add other relevant fields as needed
);

-- Table for storing information about student sections
CREATE TABLE sections (
    section_id SERIAL PRIMARY KEY,
    section_name VARCHAR(50) NOT NULL
    -- Add other relevant fields as needed
);

-- Table for mapping students to classes and sections
CREATE TABLE student_class_section_mapping (
    student_id INTEGER REFERENCES students(student_id),
    class_id INTEGER REFERENCES classes(class_id),
    section_id INTEGER REFERENCES sections(section_id),
    PRIMARY KEY (student_id),
    UNIQUE (student_id, class_id, section_id)
);

-- Table for mapping teachers to students
CREATE TABLE teacher_student_mapping (
    teacher_id INTEGER REFERENCES teachers(teacher_id),
    student_id INTEGER REFERENCES students(student_id),
    PRIMARY KEY (teacher_id, student_id)
);

-- Table for mapping teachers to classes and sections
CREATE TABLE teacher_class_section_mapping (
    teacher_id INTEGER REFERENCES teachers(teacher_id),
    class_id INTEGER REFERENCES classes(class_id),
    section_id INTEGER REFERENCES sections(section_id),
    PRIMARY KEY (class_id, section_id)
);

-- Table for mapping students to subjects and marks
CREATE TABLE student_subject_marks_mapping (
    student_id INTEGER REFERENCES students(student_id),
    subject_id INTEGER REFERENCES subjects(subject_id),
    marks INTEGER,
    PRIMARY KEY (student_id, subject_id)
);

