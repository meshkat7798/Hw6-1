CREATE TABLE authors (
    id serial PRIMARY KEY ,
    firstname VARCHAR (50),
    lastname VARCHAR (50),
    age int
)

CREATE TABLE books(
    id serial PRIMARY KEY ,
    title VARCHAR (50),
    author_id REFERENCES author(id),
    published_year int
)