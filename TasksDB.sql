CREATE DATABASE TasksDB;

CREATE TABLE TasksDB.users (
    UserID int NOT NULL,
    UserName varchar(255),
    Password varchar(255),
    PRIMARY KEY (UserID)
);

CREATE TABLE TasksDB.tasks (
    TaskID int NOT NULL,
    TaskDetalis text,
    DateOfCreation date,
    DueDate date,
    OwnerID int,
    Completion boolean,
    PRIMARY KEY (TaskID),
    FOREIGN KEY (OwnerID) REFERENCES users(UserID)
);
