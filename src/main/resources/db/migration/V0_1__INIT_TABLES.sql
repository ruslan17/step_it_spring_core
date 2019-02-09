CREATE TABLE groups (
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(100),
  description   TEXT,
  date_created  TIMESTAMP NOT NULL DEFAULT NOW(),
  date_updated  TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE providers (
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(100),
  description   TEXT,
  group_id      INT REFERENCES groups(id) ON DELETE CASCADE,
  date_created  TIMESTAMP NOT NULL DEFAULT NOW(),
  date_updated  TIMESTAMP NOT NULL DEFAULT NOW()
);