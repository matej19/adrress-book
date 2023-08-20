CREATE TABLE Person (
    id BIGINT NOT NULL,
    name VARCHAR(255),
    surname VARCHAR(255),
    PRIMARY KEY ( id )
);

CREATE TABLE Phone (
    id BIGINT NOT NULL,
    number VARCHAR(255),
    owner_id BIGINT NOT NULL,
    PRIMARY KEY ( id ),
    FOREIGN KEY (owner_id) REFERENCES Person(id)
);

CREATE TABLE Email (
    id BIGINT NOT NULL,
    address VARCHAR(255),
    owner_id BIGINT NOT NULL,
    PRIMARY KEY ( id ),
    FOREIGN KEY (owner_id) REFERENCES Person(id)
);
