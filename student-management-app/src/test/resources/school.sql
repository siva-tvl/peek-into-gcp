
create table application (
    applicationId VARCHAR(36) not null,
    userId VARCHAR(36) not null,
    createTs TIMESTAMP not null,
    updateTs TIMESTAMP not null
);

