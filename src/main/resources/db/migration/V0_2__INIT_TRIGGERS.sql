CREATE OR REPLACE FUNCTION trigger_set_timestamp()
  RETURNS TRIGGER AS
$$
BEGIN
  NEW.date_updated = NOW();
  RETURN NEW;
END;
$$
LANGUAGE plpgsql;

CREATE TRIGGER groups_update_date_trigger
  BEFORE UPDATE
  ON groups
  FOR EACH ROW
EXECUTE PROCEDURE trigger_set_timestamp();

CREATE TRIGGER providers_update_date_trigger
  BEFORE UPDATE
  ON groups
  FOR EACH ROW
EXECUTE PROCEDURE trigger_set_timestamp();