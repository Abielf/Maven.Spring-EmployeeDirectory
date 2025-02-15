DROP TABLE Employee;

CREATE TABLE Employee (
  ID NUMBER(10,0) NOT NULL AUTO_INCREMENT,
  FIRST_NAME VARCHAR2(255) NOT NULL DEFAULT '',
  LAST_NAME VARCHAR2(255) NOT NULL DEFAULT '',
  HIRE_DATE VARCHAR2(20) NOT NULL DEFAULT '',
  PHONE_NUM VARCHAR2(20) NOT NULL DEFAULT '',
  E_MAIL VARCHAR2(20) NOT NULL DEFAULT '',
  TITLE VARCHAR2(20) NOT NULL DEFAULT '',
  MANAGER_ID NUMBER(10),
  DEPT_ID NUMBER(10),
  PRIMARY KEY (ID));

DROP TABLE Department;

CREATE TABLE Department (
  ID NUMBER(10,0) NOT NULL AUTO_INCREMENT,
  NAME varchar2(255) NOT NULL DEFAULT '',
  MANAGER JAVA_OBJECT,
  PRIMARY KEY (ID)
);


DROP SEQUENCE hibernate_sequence;

CREATE SEQUENCE hibernate_sequence;