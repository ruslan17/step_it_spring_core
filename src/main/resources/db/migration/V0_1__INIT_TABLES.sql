CREATE TABLE users (
  id         SERIAL PRIMARY KEY,
  name       VARCHAR(100),
  username   VARCHAR(20) UNIQUE,
  email      VARCHAR(50) UNIQUE,
  birth_date DATE,
  role       VARCHAR(25) DEFAULT 'ROLE_USER'
);