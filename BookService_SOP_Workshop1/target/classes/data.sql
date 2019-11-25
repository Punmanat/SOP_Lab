drop table if exists book;
create table book (
  id int auto_increment primary key,
  ISBN varchar (255),
  title varchar (255),
  price double,
  author varchar (255),
  briefStory varchar (1000),
  dateOfPublish varchar (255),
  publisher varchar (255),
  numOfPages varchar (255),
  genre varchar (255)
);
insert into
  book (
    ISBN,
    title,
    price,
    author,
    briefStory,
    dateOfPublish,
    publisher,
    numOfPages,
    genre
  )
values
  (
    '978-1644450000',
    'Milkman: A Novel',
    7.91,
    'Anna Burns',
    'Everything about this novel rings true. . . . Original, funny, disarmingly oblique and unique.―The Guardian',
    'December 4, 2018',
    'raywolf Press; Reprint edition',
    '360 pages',
    'Literature'
  );
insert into
  book (
    ISBN,
    title,
    price,
    author,
    briefStory,
    dateOfPublish,
    publisher,
    numOfPages,
    genre
  )
values
  (
    '978-1594206252',
    'Feel Free: Essays',
    11.87,
    'Zadie Smith',
    'From Zadie Smith, one of the most beloved authors of her generation, a new collection of essays',
    'February 6, 2018',
    'Penguin Press; 1st Edition edition',
    '464 pages',
    'Literature'
  );
insert into
  book (
    ISBN,
    title,
    price,
    author,
    briefStory,
    dateOfPublish,
    publisher,
    numOfPages,
    genre
  )
values
  (
    '978-1559369527',
    'Fairview',
    13.46,
    'Jackie Sibblies Drury',
    'Dazzling and ruthless…One of the most exquisitely and systematically arranged ambushes of an unsuspecting audience in years…A glorious, scary reminder of the unmatched power of live theater to rattle, roil and shake us wide awake.” —Ben Brantley, New York Times',
    'August 27, 2019',
    'Theatre Communications Group',
    '120 pages',
    'Politics'
  );
insert into
  book (
    ISBN,
    title,
    price,
    author,
    briefStory,
    dateOfPublish,
    publisher,
    numOfPages,
    genre
  )
values
  (
    '978-1787131187',
    'Goat: Cooking and Eating',
    19.32,
    'James Whetlor',
    'We should all be eating more goat. Its sustainable, ethical, highly nutritious and low in calories. Why then does it remain so underused and misunderstood?',
    'Quadrille Publishing',
    'May 1, 2018',
    '224 pages',
    'Politics'
  );
insert into
  book (
    ISBN,
    title,
    price,
    author,
    briefStory,
    dateOfPublish,
    publisher,
    numOfPages,
    genre
  )
values
  (
    '978-1335613004',
    'How to Keep a Secret',
    12.27,
    'Sarah Morgan',
    'When three generations of women are brought together by crisis, they learn over the course of one hot summer the power of family to support, nourish and surprise',
    'July 10, 2018',
    'HQN; Original edition',
    '432 pages',
    'Literature'
  );