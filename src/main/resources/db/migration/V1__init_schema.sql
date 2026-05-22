create table users
(
    id           uuid primary key,
    email        varchar(255)             not null unique,
    display_name varchar(255),
    created_at   timestamp with time zone not null
);

create table artists
(
    id              uuid primary key,
    name            varchar(255)             not null,
    normalized_name varchar(255)             not null,
    created_at      timestamp with time zone not null
);

create table albums
(
    id               uuid primary key,
    title            varchar(255)             not null,
    normalized_title varchar(255)             not null,
    release_date     date,
    created_at       timestamp with time zone not null
);

create table tracks
(
    id               uuid primary key,
    title            varchar(255)             not null,
    normalized_title varchar(255)             not null,
    duration_ms      integer                  not null,
    explicit         boolean                  not null default false,
    album_id         uuid references albums (id),
    created_at       timestamp with time zone not null
);

create table music_accounts
(
    id                      uuid primary key,
    user_id                 uuid                     not null references users (id),
    provider                varchar(50)              not null,
    provider_user_id        varchar(255)             not null,
    access_token_encrypted  text,
    refresh_token_encrypted text,
    token_expires_at        timestamp with time zone,
    created_at              timestamp with time zone not null,
    unique (user_id, provider)
);
