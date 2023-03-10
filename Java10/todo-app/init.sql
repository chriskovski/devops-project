CREATE TABLE IF NOT EXISTS todos (
  id INT(11) NOT NULL AUTO_INCREMENT,
  text VARCHAR(255) NOT NULL,
  completed BOOLEAN NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO todos (text, completed) VALUES ('Do the laundry', false);
INSERT INTO todos (text, completed) VALUES ('Buy groceries', true);